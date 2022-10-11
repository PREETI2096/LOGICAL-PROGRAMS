package com.bridgelabz.logicalprogramming;

public class CouponCodeProgram {

	public static void main(String[] args) {
		char[] chars = "123456789".toCharArray();
		int max = 10000;
		int random = (int)(Math.random()*max);
		StringBuffer sb = new StringBuffer();
		while(random > 0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
			}
		String couponCode = sb.toString();
		System.out.println("Coupon code:"+ couponCode);


	}

}
