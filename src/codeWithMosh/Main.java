package codeWithMosh;


import generics.GenericList;
import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args){
        // int -> Integer
        // float -> Float
        // boolean -> Boolean
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); //Boxing
        numbers.get(0); //Unboxing
    }
}
