package ExceptionsDemo;

import java.io.IOException;

public class Account {
    private float blance;
    public void deposit(float value) throws IOException{
        if(value <= 0){
            throw new IOException();
        }
    }
    public void withdraw(float value) throws AccountException {
        if (value > blance){
             throw new AccountException(new InsufficientFundsException());
        }
    }
}
