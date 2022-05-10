package codeWithMosh;


import generics.GenericList;
import generics.List;
import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args){
       var utils = new Utils();
       var max = utils.max(new User(10), new User(20));
       System.out.println(max);
    }
}
