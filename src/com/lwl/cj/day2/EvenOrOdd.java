package com.lwl.cj.day2;

public class EvenOrOdd {

		public static void main(String[] args) {
			int num = (int)(Math.random() * 1000);
			System.out.println("Number :"+num +" is " +(num % 2 == 0 ? "Even":"Odd"));
		}
}
