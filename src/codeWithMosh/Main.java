package codeWithMosh;

import ExceptionsDemo.ExceptionDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            ExceptionDemo.show();
        } catch (Throwable e) {
            System.out.println("an unexpected error occurred");
        }
    }
}
