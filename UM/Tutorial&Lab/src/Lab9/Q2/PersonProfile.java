package Lab9.Q2;

import java.io.FileInputStream;
import java.util.Scanner;

public class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;

    public PersonProfile(String name,String gender,String dateOfBirth){
        this.name=name;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
    }

    public String toString(){
        return "Name:"+name+"\nGender:"+gender+"\n"+"Date of Birth:"+dateOfBirth;
    }

}

class Student extends PersonProfile{
    String[]courseName;
    String[]courseCode;
    int[]semester;
    int[]session;
    int[]mark;
    String filename;

    public Student(String name,String gender,String dateOfBirth,String filename){
        super(name, gender, dateOfBirth);
        this.filename=filename;
        try{
            FileInputStream file=new FileInputStream(this.filename);
            Scanner sc=new Scanner(file);
            int line=0;
            while (sc.hasNextLine()){
                String lines=sc.nextLine();
                line+=1;
            }
            file.close();
            int num_of_data=line/5;
            courseCode=new String[num_of_data];
            courseName=new String[num_of_data];
            session=new int[num_of_data];
            semester=new int[num_of_data];
            mark=new int[num_of_data];
            FileInputStream f=new FileInputStream(this.filename);
            Scanner input=new Scanner(f);
            for(int i=0;i<num_of_data;i++){
                courseCode[i]=input.nextLine();
                courseName[i]=input.nextLine();
                session[i]=Integer.parseInt(input.nextLine());
                semester[i]=Integer.parseInt(input.nextLine());
                mark[i]=Integer.parseInt(input.nextLine());
            }
            input.close();
        } catch (Exception e) {
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
        sb.append("\nCourse\n\n");
        for(int i=0;i< courseCode.length;i++){
            sb.append("Course name: ").append(courseName[i]).append("\n");
            sb.append("Course code: ").append(courseCode[i]).append("\n");
            sb.append("Session: ").append(session[i]).append("\n");
            sb.append("Semester: ").append(semester[i]).append("\n");
            sb.append("Mark: ").append(mark[i]).append("\n");
            sb.append("Grade: ").append(getGrade(mark[i])).append("\n\n");

        }
        return sb.toString().trim();
    }
}
class Tester{
    public static void main(String[] args) {
        Students s1=new Students("Joe","M","1999-3-12", "Tutorial&Lab/course.txt");
        System.out.println(s1);
    }


}
