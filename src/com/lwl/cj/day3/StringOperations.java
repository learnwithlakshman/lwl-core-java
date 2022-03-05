package com.lwl.cj.day3;

public class StringOperations {

		public static void main(String[] args) {
			
				String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			for(;;) {
				String str = "";
				for(int i=1;i<=5;i++) {
					int num = (int)(Math.random() * data.length());
					str += data.charAt(num);
				}
				
				boolean isPalindrome = new StringBuffer(str).reverse().toString().equals(str);
				System.out.println(str +" is Palindrome :"+(isPalindrome? "Yes":"No"));
				if(isPalindrome)
					break;
			}
	    }
}
