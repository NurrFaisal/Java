package codeWithMosh;


import generics.GenericList;
import generics.List;
import generics.User;

public class Main {
    public static void main(String[] args){
//      var list = new GenericList<Integer>();
      var list = new GenericList<User>();
//      list.add(10);
//      int number = list.get(0);
      list.add(new User());
      User user = list.get(0);
    }
}
