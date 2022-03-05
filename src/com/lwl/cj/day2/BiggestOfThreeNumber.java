package com.lwl.cj.day2;

public class BiggestOfThreeNumber {

	public static void main(String[] args) {
			
			int num1 = (int)(Math.random() * 1000);
			int num2 = (int)(Math.random() * 1000);
			int num3 = (int)(Math.random() * 1000);
			int biggest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
			System.out.println(String.format("Biggest of %s, %s and %s = %s",num1,num2,num3,biggest));
		}
}
