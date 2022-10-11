package com.bridgelabz.logicalprogramming;
import java.util.Scanner;
public class StopWatchProgram {

	public static void main(String[] args) {
		char input = ' ';
		long start = 0;
		long end = 0;
		double timeElapsed = 0;
		System.out.println("Enter any Character to start stopwatch:");
		Scanner sc = new Scanner(System.in);
		input = sc.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println("Enter any character to stop stopwatch:");
		input = sc.next().charAt(0);
        end = System.currentTimeMillis();
        timeElapsed = (end - start)/1000;
        System.out.println("Time elapsed:"+ timeElapsed+"sec");
	sc.close();
	
	}

}
