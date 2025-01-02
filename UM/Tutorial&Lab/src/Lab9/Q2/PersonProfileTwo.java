package Lab9.Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonProfileTwo {
    private String name;
    private String gender;
    private String dateOfBirth;

    public PersonProfileTwo(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Name:"+name+"\nGender:"+gender+"\nDate of Birth:"+dateOfBirth;
    }

}

class Studentss extends PersonProfileTwo {
    String[] courseCode;
    String[] courseName;
    int[] semsester;
    int[] session;
    int[] mark;
    String filename;

    public Studentss(String name, String gender, String date, String filename) {
        super(name, gender, date);
        this.filename = filename;
        int totalCourse = 0;
        int totalLine = 0;
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                totalLine++;
            }
            sc.close();
            totalCourse = totalLine / 5;
            courseCode = new String[totalCourse];
            courseName = new String[totalCourse];
            semsester = new int[totalCourse];
            session = new int[totalCourse];
            mark = new int[totalCourse];
            try {
                File file1 = new File(filename);
                Scanner scanner = new Scanner(file1);
                for (int i = 0; i < totalCourse; i++) {
                    courseCode[i] = scanner.nextLine();
                    courseName[i] = scanner.nextLine();
                    semsester[i] = Integer.parseInt(scanner.nextLine());
                    session[i] = Integer.parseInt(scanner.nextLine());
                    mark[i] = Integer.parseInt(scanner.nextLine());
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getGrade(int mark) {
        if (mark >= 85) return "A";
        if (mark >= 75) return "A-";
        if (mark >= 70) return "B+";
        if (mark >= 65) return "B";
        if (mark >= 60) return "B-";
        if (mark >= 55) return "C+";
        if (mark >= 50) return "C";
        if (mark >= 45) return "D";
        if (mark >= 35) return "E";
        return "F";
    }

    public String toString(){
        StringBuilder sb=new StringBuilder(super.toString());//initial content
        sb.append("\n\n\nCourse details\n");
        for(int i=0;i<courseCode.length;i++){
            sb.append("Course code:").append(courseCode[i]+"\n");
            sb.append("Course name:").append(courseName[i]).append("\n");
            sb.append("Session:").append(session[i]).append("\n");
            sb.append("Semester:").append(semsester[i]).append("\n");
            sb.append("Mark:").append(mark[i]).append("\n");
            sb.append("Grade:").append(getGrade(mark[i])).append("\n\n");
        }
        return sb.toString().trim();
    }
}

class Test{
    public static void main(String[] args) {
        Studentss studentss=new Studentss("Alice","Female","23/5/2003", "Tutorial&Lab/course.txt");
        System.out.println(studentss);
    }
}
