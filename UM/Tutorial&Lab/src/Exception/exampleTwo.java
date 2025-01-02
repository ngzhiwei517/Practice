package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exampleTwo {

/*    public static void readFile(String path) throws FileNotFoundException {
       File file=new File(path);
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
    }*/
    public static void readContent(String path) {
        try{
            File file=new File(path);
            if(!file.exists()){
                throw new FileNotFoundException("File not found");
            }
            System.out.println("File exists");
        }catch (FileNotFoundException e){
            System.out.println("Handled inside method:"+e.getMessage());
        }
    }


    public static void main(String[] args) {
/*      try{

          readContent("Cat.txt");
      } catch (FileNotFoundException e) {
          System.out.println("Error: "+e.getMessage());
      }*/

        readContent("Cat.txt");
    }
}
