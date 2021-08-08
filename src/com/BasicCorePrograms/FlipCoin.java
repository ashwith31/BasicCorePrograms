package com.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of times you want to flip a coin");
		int i=s.nextInt();
		if(check(i))
		flipCoin(i);
	}
	public static void flipCoin(int i)
	{
		float headCount=0;
		float tailCount=0;
		for(int j=0;j<i;j++)
		{
			float toss=(float) Math.random();
			if(toss<0.5)
				tailCount++;
			else
				headCount++;
		}
		float tailPercentage=tailCount/i*100;
		float headPercentage=headCount/i*100;
		System.out.println("Percentage win of Heads= "+headPercentage);
		System.out.println("Percentage win of Tails= "+tailPercentage);
	}
	public static boolean check(int h)
	{
		if(h<0)
		{
			System.out.println("Enter a correct input");
			return false;
		}
		else
		return true;
	}

}
