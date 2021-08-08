package com.BasicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {
	static void power(int i)
	{
		for(int j=0;j<=i;j++)
		{
			int value=(int) Math.pow(2, j);
			System.out.println("2 power "+j+" = "+value);
		}
	}
	public static void main(String[] args) {

		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit until which you want to calculate the power of 2");
		number=sc.nextInt();
		if(number<32)
		{
			power(number);
		}
		else
		{
			System.out.println("Sorry.The limit cant exceed 31");
			System.out.println("Try again");
		}
		
	}
}
