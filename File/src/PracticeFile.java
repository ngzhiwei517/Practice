import java.io.*;
import java.util.Scanner;

public class PracticeFile {
    public static void main(String[] args) {
        try {
            /*File file=new File("newfile.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();*/


/*            FileWriter fileWriter=new FileWriter("newfile.txt",true);
            fileWriter.write("\nCan do!");
            fileWriter.close();

            FileReader reader=new FileReader("newfile.txt");
            int character;
            while ((character=reader.read())!=-1){
                System.out.print((char) character);
            }*/

            FileOutputStream fileOutputStream = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(4);
            objectOutputStream.writeObject("Hi Bye");
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            System.out.println("Integer data:"+objectInputStream.readInt());
            System.out.println("String data:"+objectInputStream.readObject());


        } catch (Exception e) {
            System.out.println("An error occured!");
        }
    }
}
