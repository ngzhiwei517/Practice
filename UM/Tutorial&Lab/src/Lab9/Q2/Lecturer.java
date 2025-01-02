package Lab9.Q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfileTwo {
    private String filename;
    String[] courseCode;
    String[] courseName;
    int[] semsester;
    int[] session;
    int[] creditHour;
    int[] numOfStudent;

    public Lecturer(String name, String gender, String date, String filename) {
        super(name, gender, date);
        this.filename = filename;
        int numOfCourse=0;
        int numOfLines=0;
        try{
            FileInputStream fileInputStream=new FileInputStream(filename);
            Scanner sc=new Scanner(fileInputStream);
            while (sc.hasNextLine()){
                sc.nextLine();
                numOfLines++;
            }
            numOfCourse=numOfLines/6;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        courseCode = new String[numOfCourse];
        courseName = new String[numOfCourse];
        semsester = new int[numOfCourse];
        session = new int[numOfCourse];
        creditHour=new int[numOfCourse];
        numOfStudent=new int[numOfCourse];

        try{
          File file=new File(filename);
          Scanner scanner=new Scanner(file);
          for(int i=0;i<numOfCourse;i++){
              courseCode[i]=scanner.nextLine();
              courseName[i]= scanner.nextLine();
              session[i]= Integer.parseInt(scanner.nextLine());
              semsester[i]= Integer.parseInt(scanner.nextLine());
              creditHour[i]= Integer.parseInt(scanner.nextLine());
              numOfStudent[i]=Integer.parseInt(scanner.nextLine());
          }
          scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void computeCreditHour() {
        for(int i=0;i<courseCode.length;i++){
            int registerStudent=numOfStudent[i];
            if(registerStudent>=150){
                creditHour[i]*=3;
            }else if(registerStudent>=100 && registerStudent<150){
                creditHour[i]*=2;
            } else if (registerStudent>=50 && registerStudent<100) {
                creditHour[i]*=1.5;
            }else{
                creditHour[i]*=1;
            }
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append("\n\nCourse profile:\n");
        for(int i=0;i<courseCode.length;i++){
            sb.append("Course code:").append(courseCode[i]);
            sb.append("\nCourse name:").append(courseName[i]);
            sb.append("\nSession:").append(session[i]);
            sb.append("\nSemeseter:").append(semsester[i]);
            sb.append("\nUpdated credit hour:").append(creditHour[i]);
            sb.append("\nNumber of students:").append(numOfStudent[i]).append("\n\n");
        }
        return sb.toString();
    }
}
class TesterLecturer{
    public static void main(String[] args) {
        Lecturer lecturer=new Lecturer("Lim","Male","1982/4/22", "Tutorial&Lab/lecturer.txt");
        lecturer.computeCreditHour();
        System.out.println(lecturer);
    }
}
