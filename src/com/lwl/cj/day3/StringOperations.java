package com.lwl.cj.day3;

public class StringOperations {

	public static void main(String[] args) {
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "";
		for (int i = 1; i <= 3; i++) {
			int num = (int) (Math.random() * data.length());
			str += data.charAt(num);
		}
		boolean isPalindrome = new StringBuilder(str).reverse().toString().equals(str);
		System.out.println(str + " is Palindrome :" + (isPalindrome ? "Yes" : "No"));
	}
}
