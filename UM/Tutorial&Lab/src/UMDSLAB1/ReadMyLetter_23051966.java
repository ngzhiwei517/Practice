package UMDSLAB1;

import java.io.*;
import java.util.Scanner;

public class ReadMyLetter_23051966 {
    public static void main(String[] args) {
        //Part 1
        try {
            File file = new File("Tutorial&Lab/Ng Zhi Wei_23051966.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            /*FileReader fileReader=new FileReader(file);
            int line;
            while ((line=fileReader.read())!=-1){
                System.out.print((char) line);
            }*/
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Part 2
        System.out.println("\nPart 2: Please provide the second part of the letter:");
        Scanner sc = new Scanner(System.in);

        System.out.println("How you have performed in the class?");
        String performance = sc.nextLine();

        System.out.println("Are you happy with your performance?");
        String happiness = sc.nextLine();

        System.out.println("What has learning DS taught you / what did you learn from DS?");
        String lessonLearned = sc.nextLine();

        System.out.println("Has your target grade changed?");
        String targetGradeChange = sc.nextLine();

        System.out.println("What did you do well during the course?");
        String thingsDoneWell = sc.nextLine();

        System.out.println("What could have been done better?");
        String thingsToImprove = sc.nextLine();

        String secondPart = "\n\nThursday, 18 June 2021.\n" + "It’s me again. Finally, it’s the end of the term and the DS class has finished! \nI think I did " + performance + " in this course. I am " + happiness + " with my performance. I have laern " + lessonLearned + "." + "\nMy target grade " + (targetGradeChange.isEmpty() ? "remained the same." : "has changed to " + targetGradeChange + ".") + " \nDuring the course, I did well in " + thingsDoneWell + "\n.However, i think I could do better in " + thingsToImprove + ".";

        try{
            FileWriter fileWriter=new FileWriter("Tutorial&Lab/Ng Zhi Wei_23051966.txt",true);
            fileWriter.write(secondPart);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Part 3 read back the content of the file
        try{
            FileReader fileReader=new FileReader("Tutorial&Lab/Ng Zhi Wei_23051966.txt");
            Scanner scanner=new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
