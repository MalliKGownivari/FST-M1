package com.java.fst;
import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        
       List<String> myList = new ArrayList<String>();
    
        myList.add("Apple");
        myList.add("Watermelon");
        myList.add("Banana");
        
        myList.add(3, "Pineapple");
        myList.add(1, "Kiwi");
        
        System.out.println("Print All the Objects:");
        for(String fruits:myList){
            System.out.println(fruits);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Pineapple is in list: " + myList.contains("Pineapple"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Kiwi");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}