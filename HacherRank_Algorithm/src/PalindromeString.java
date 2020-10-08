/*
Algorithm "Palindrome String" 
*/

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.println("Write a string");
		str = input.nextLine();
		int halfLength = str.length() / 2;
		for(int i = 0; i < halfLength; i++) {
			int j = str.length() - 1 - i;
			System.out.println(String.format("Comparing %d with %d", i, j));
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		
		System.out.println("It is a palindrome");
	}

}


