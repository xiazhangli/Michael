package com.xia;


import java.util.Scanner;

public class Comparison {
	
	public static final void main(String[] arg0)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two floating-point numbers: ");
		String num_1 = String.format("%5.2f", input.nextDouble());
		System.out.println(num_1);
		String num_2 = String.format("%5.2f", input.nextDouble());
		System.out.println(num_2);
		System.out.println((double) Math.abs(Double.parseDouble(num_1) - Double.parseDouble(num_2)));
		if(Math.abs(Double.parseDouble(num_1) - Double.parseDouble(num_2)) <= 0.01)
			System.out.println("They are the same!");
		else
			System.out.println("They are the different!");
 
	}
}
