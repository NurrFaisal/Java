package ExceptionsDemo;

import javax.script.SimpleBindings;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        var account = new Account();
        account.deposit(1);
    }
}
