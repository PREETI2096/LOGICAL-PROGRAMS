package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class ReverseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		int reverse = 0;
		int rem;
		while(num != 0)
		{
			rem = num%10;
			reverse = reverse * 10 + rem;
			num /= 10;
		};
		System.out.println("Reversed number : " + reverse);


	}

}
