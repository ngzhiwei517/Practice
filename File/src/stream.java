import java.io.*;
import java.util.Scanner;

public class stream {
    public static void main(String[] args) {
        try {
           /* File file=new File("content.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());*/


/*          FileWriter fileWriter=new FileWriter("newfile.txt",true);
            fileWriter.write("\nThis file was created automatically.");
            fileWriter.write("File created and data written.");
            fileWriter.close();*/

            //Only filewritter and fileOutputStream support append mode
            /*PrintWriter writer = new PrintWriter("newfile.txt");
            writer.print("Hi,just write");
            writer.close();
*/
        /*try{
            File myObj=new File("content.txt.txt");
            Scanner read=new Scanner(myObj);
            while (read.hasNextLine()){
                String data=read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }*/


//        try {
//            int data1=5;
//            String data2="This is progrmaiz";
//            FileOutputStream fileStream=new FileOutputStream("file.txt");
//            ObjectOutputStream objOutput=new ObjectOutputStream(fileStream);
//            objOutput.writeInt(data1);
//            objOutput.writeObject(data2);
//
//           FileInputStream file=new FileInputStream("file.txt");
//           ObjectInputStream obj=new ObjectInputStream(file);
//            System.out.println("Integer data:"+obj.readInt());
//            System.out.println("String data:"+obj.readObject());
//
//            objOutput.close();
//            obj.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }


            /*both FileOutputStream and FileWriter support append mode and will automatically create the file if it doesn't exist. */
/*            int data=5;
            String name="ngzhiwei";
            FileOutputStream outputStream=new FileOutputStream("MyName.txt",true);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeInt(data);
            objectOutputStream.writeObject(name);
            objectOutputStream.close();
            FileInputStream inputStream=new FileInputStream("MyName.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            System.out.println("Integer data:"+objectInputStream.readInt());
            System.out.println("String data:"+objectInputStream.readObject());
            objectInputStream.close();*/


            /*reader.read() reads characters one at a time. If a character is read successfully, it returns its integer representation.
             If the end of the file is reached, it returns -1.
             reader.read() works with character data, so it doesn't handle objects directly.*/

            FileWriter writer=new FileWriter("newfile.txt",true);
            writer.write("\nHello guys\n");
            writer.write(Integer.toString(5));
            writer.close();

            FileReader fileReader=new FileReader("newfile.txt");
            System.out.println("Reading content from the file");
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
            fileReader.close();
        /*try{
            String data="This is a text inside the file";
            String content="This is another line of text";
            int date=23;
            PrintWriter output=new PrintWriter("file.txt");
            output.printf("I am %d years old\n",date);
            output.println(content);
            output.println(data);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}