package UMDSLAB1.Q2;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        int totalCount=0;
        StringBuilder sb=new StringBuilder();

        try{
           /* File file=new File("Tutorial&Lab/text1.txt");
            Scanner sc=new Scanner(file);
            sc.useDelimiter(",|\\s+"); //treat the comma or any whitespace as delimeter
            while (sc.hasNext()){
                char ch=sc.next().charAt(0);
                totalCount++;
                sb.append(ch);
            }
            sc.close();*/

/*            FileReader fileReader=new FileReader("Tutorial&Lab/text1.txt");
            int text;
            while ((text=fileReader.read())!=-1){
                char ch=(char) text;
                if(Character.isLetter(ch)){
                    sb.append(ch);
                    totalCount++;
                }
            }*/


/*          System.out.println("Total character retrived from text1.txt:"+totalCount);
            System.out.println("Display all the character from the text file without special character:");*/

            /*When read integer recommended to use scanner*/

//            File file=new File("Tutorial&Lab/text2.txt");
/*            Scanner sc=new Scanner(file);
            sc.useDelimiter(",|\\s+"); //treat the comma and space as delimeter
            while (sc.hasNext()){
                if(sc.hasNextInt()){
                    int num=sc.nextInt();
                    totalCount++;
                    sb.append(num+" ");
                }else{
                    sc.next();
                }
            }*/


           /* System.out.println("Total Integer retrived from text2.txt:"+totalCount);
            System.out.println("Display all the integer from the text file without special character:");*/

            File file=new File("Tutorial&Lab/text4.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNext()){
                sb.append(sc.next());
                totalCount++;
            }
            System.out.println("Total character retrived from text3.txt:"+totalCount);
            System.out.println("Display all the character from the text file without special character:");
            System.out.println(sb);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
