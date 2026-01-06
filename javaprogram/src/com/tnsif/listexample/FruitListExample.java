package com.tnsif.listexample;
import java.util.ArrayList;
import java.util.List;
public class FruitListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Orange");

        fruits.remove("Mango");
        System.out.println("Updated Fruits List:" +fruits);
        
            
        } 
    }

