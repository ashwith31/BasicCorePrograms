package com.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.print("The Prime Factors of " + num + " are - ");
		int i = 2;
		while (num > 1) {
			if (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			} else
				i++;
		}
	}
}
