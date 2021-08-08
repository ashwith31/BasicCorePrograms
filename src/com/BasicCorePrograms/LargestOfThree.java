package com.BasicCorePrograms;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);          //taking the inputs from user
        System.out.print("Please input 3 integers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        //finding the largest number
        int largestNumber = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        System.out.println(largestNumber+ " is the Largest Number");
	}
}
