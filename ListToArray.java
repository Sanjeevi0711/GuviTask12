package com.example.hr12;

import java.util.List;

public class ListToArray {
	
	public static void main(String[] args) {
       
        List<Integer> integerList = new ArrayList();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

       
        Integer[] integerArray = integerList.toArray(new Integer[0]);

   
        System.out.println("Elements in the array:");
        for (Integer num : integerArray) {
            System.out.println(num);
        }
    }
}


