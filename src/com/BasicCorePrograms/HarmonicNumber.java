package com.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void getHarmonic(int f)
	{
		float i=1;
	    float value=0;
		while(i<f)
		{
			float val=1/i;
			value +=val;
			i++;
		}
		System.out.println(value);
	}
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int input=sc.nextInt();
		if(input!=0)
		{
			getHarmonic(input);
		}
		else
		{
			System.out.println("Zero is not allowed");
		}
	}
}
