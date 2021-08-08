package com.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
	public static void checkLeap(int i)
	{
		
		if ((i %4 == 0 && i %100 != 0) || i%400 == 0)
		{
			System.out.println("Its a leap year");
		}
		else
		{
			System.out.println("Its not a Leap Year");
		}
	}

	public static void main(String[] args) {

		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		year=sc.nextInt();
		if(year>=1000)
		{
			checkLeap(year);
		}
		else
		{
			System.out.println("Enter year greater than 999");
		}
		
	}
}
