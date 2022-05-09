package ExceptionsDemo;

import javax.script.SimpleBindings;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exit !!!");
        } catch (IOException e){
            System.out.println("Could not read data !!!");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
