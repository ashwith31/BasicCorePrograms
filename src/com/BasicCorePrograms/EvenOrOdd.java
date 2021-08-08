package com.BasicCorePrograms;

import java.util.Scanner;

public class EvenOrOdd {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int number = sc.nextInt();
	    if (number % 2 == 0) {										//condition to check if its even or odd
	    	System.out.println(number + " is Even Number");
	    }
	    else {
	    	System.out.println(number + " is Odd Number");
	    }
	}
}
