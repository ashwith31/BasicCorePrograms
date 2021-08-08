package com.BasicCorePrograms;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a alphabet to be checked if it's a vowel or consonant: ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
			System.out.println("Alphabet " + ch + " is a Vowel");
		} else {
			System.out.println("Alphabet " + ch + " is a Consonant");
		}
	}
}
