package com.example.hr12;
import java.util.*;
public class EmployeeName {
	

	
	    public static void main(String[] args) {
	        
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();
	        employeeMap.put(101, "Arun");
	        employeeMap.put(102, "Bala");
	        employeeMap.put(103, "Elango");
	        employeeMap.put(104, "Chitra");

	       
	        System.out.println("Employee Names in Alphabetical Order:");
	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	}


