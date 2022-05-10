package codeWithMosh;


import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args){
       var list = new List();
       list.add(1);
       list.add("1");
       list.add(new User());
    }
}
