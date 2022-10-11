package com.bridgelabz.logicalprogramming;

import java.util.Scanner;

public class fibonacciProgram {

	public static void main(String[] args) {
		int firstTerm = 0;
		int secondTerm = 1;

		Scanner sc = new Scanner(System.in); // scanner input
		System.out.println("Enter the number you want to print for fibonacci series : ");
		int term = sc.nextInt();
		System.out.print("Fibonacci series till " + term + " is : ");
		for (int i = 1; i <= term; i++) {
			System.out.print(firstTerm + ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}


