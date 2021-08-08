package com.BasicCorePrograms;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
	
		int i, j, swap;
		Scanner sc = new Scanner(System.in);                    //getting input from user
		System.out.println("Enter the value of X and Y");
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println("Before Swapping numbers: " + i + "  " + j);
		//swapping starts
		swap = i;
		i = j;
		j = swap;
		System.out.println("After Swapping numbers: " + i + "   " + j);
}
}
