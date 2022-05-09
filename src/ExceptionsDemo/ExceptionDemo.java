package ExceptionsDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class ExceptionDemo {
    public static void show(){
        try {
        var reader = new FileReader("file.txt");
        System.out.println("File Opened");
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

}
