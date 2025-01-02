package Lab9.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {
    private String name;
    private String gender;
    private String date;

    public Practice(String name,String gender,String date){
        this.name=name;
        this.gender=gender;
        this.date=date;
    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\n Date: "+date;
    }
}
class Students extends Practice{

    String[]courseCode;
    String[]courseName;
    int[]session;
    int[]semester;
    int[]marks;
    String fileName;

    public Students(String name, String gender, String data, String fileName){
        super(name,gender,data);
        this.fileName=fileName;
        try
        {
            FileInputStream file = new FileInputStream(fileName);
            Scanner sc=new Scanner(file);
            int numLine=0;
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                numLine++;
            }
            int num_of_course=numLine/5;
            sc.close();
            courseCode=new String[num_of_course];
            courseName=new String[num_of_course];
            session=new int[num_of_course];
            semester=new int[num_of_course];
            marks=new int[num_of_course];

            try{
                FileInputStream f=new FileInputStream(fileName);
                Scanner line=new Scanner(f);
                for(int i=0;i<num_of_course;i++){
                    courseCode[i]=line.nextLine();
                    courseName[i]=line.nextLine();
                    session[i]=Integer.parseInt(line.nextLine());
                    semester[i]=Integer.parseInt(line.nextLine());
                    marks[i]=Integer.parseInt(line.nextLine());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getGrade(int mark){
        String grade;
        if(mark>=85) return "A";
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
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append("\n");
        sb.append("Course:\n\n");
        for(int i=0;i< courseCode.length;i++){
            sb.append("Course code: ").append(courseCode[i]).append("\n");
            sb.append("Course name: ").append(courseName[i]).append("\n");
            sb.append("Session: ").append(session[i]).append("\n");
            sb.append("Semester: ").append(semester[i]).append("\n");
            sb.append("Marks: ").append(marks[i]).append("\n");
            sb.append("Grade: ").append(getGrade(marks[i])).append("\n\n");
        }
        return sb.toString().trim();
    }



}
class Main {
    public static void main(String[] args) {
        Students s1=new Students("Danny","M","2003-10-21", "Tutorial&Lab/course.txt");
        System.out.println(s1);
    }
}
