package Exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exampleThree {
    public static void main(String[] args) {
        try {
            processFile(null);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    //when calling this method we need to handle IOException, and File Not Found Exception

    /*it means that the method might throw either exception under different conditions, and it's the responsibility of the caller to handle these appropriately.*/

    public static void processFile(String path) throws NullPointerException, FileNotFoundException {
        if (path == null) {
            throw new NullPointerException("Path cannot be null");
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found");
        }
        System.out.println("File exists");

    }
}
