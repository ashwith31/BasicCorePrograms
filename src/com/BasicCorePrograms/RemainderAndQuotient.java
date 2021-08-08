package com.BasicCorePrograms;

import java.util.Scanner;

public class RemainderAndQuotient {
	 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);          // taking input from user
        System.out.print("Enter the number which you want to divide: ");
        int inputDividend = sc.nextInt();
        System.out.print("Enter The Divisor: ");
        int inputDivisor = sc.nextInt();
        int Quotient = inputDividend / inputDivisor;		//Quotient Calculated
        int Remainder = inputDividend % inputDivisor;       //Remainder Calculated
        System.out.println("Quotient: " + Quotient);
        System.out.println("Remainder: " +Remainder);
	}
}
