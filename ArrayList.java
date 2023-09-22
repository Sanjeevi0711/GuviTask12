package com.example.hr12;

import java.util.List;

public class ArrayList {
	 public static void main(String[] args) {
	      
	        List<String> stringList = new ArrayList<>();

	      
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");
	        stringList.add("Date");

	      
	        System.out.println("ArrayList before removal:");
	        for (String element : stringList) {
	            System.out.println(element);
	        }

	      
	        stringList.clear();

	        
	        System.out.println("\nArrayList after removal:");
	        for (String element : stringList) {
	            System.out.println(element);
	        }
	    }
	}

