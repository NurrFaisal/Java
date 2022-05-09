package ExceptionsDemo;

// checked -> Exception
// unchecked -> RuntimeException
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Insufficient Funds In Your Account !");
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
