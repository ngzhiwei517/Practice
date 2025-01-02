package UMDSLAB1.Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
/*        int totalCharCount=0;
        StringBuilder sb=new StringBuilder();*/

        int totalInteger = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try {
/*            FileReader fileReader=new FileReader("Tutorial&Lab/text1.txt");
            int text;
            while ((text=fileReader.read())!=-1){
                char ch=(char)text;
                if(Character.isLetter(ch)){
                    totalCharCount++;
                    sb.append(ch);
                }
            }*/
            File file = new File("Tutorial&Lab/text2.txt");
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",|\\s+");//treat the comma or any whiteSpace character as delimeter
            System.out.println("Display all the integer from the file:");
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    totalInteger++;
                    int num = sc.nextInt();
                    System.out.print(num+" ");
                }else{
                    sc.next();
                }
            }
            System.out.println("\nNumber of integer retrived from text 2:" + totalInteger);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

/*        System.out.println("Number of character retrived from text 1:"+totalCharCount);
        System.out.println("Display all the character from the file:");
        System.out.println(sb);*/


    }


}
