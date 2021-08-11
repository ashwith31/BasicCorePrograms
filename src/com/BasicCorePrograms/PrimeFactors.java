package com.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.print("The Prime Factors of " + num + " are - ");
		if(num%2==0)
			System.out.print("2 ");
		for(int i=2;i<num/2;i++) {
			int flag=0;
			if (num % i == 0) {
				for(int j=2;j<i/2;j++) {
					if(i%j!=0) {
				flag=1;
					}
					else {
						flag=0;
					}	
			}
				}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}
}
