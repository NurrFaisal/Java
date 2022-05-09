package ExceptionsDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class ExceptionDemo {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Opened");

    }

}
