/*HackerRank Algorithm - Let's Review 

Given a string,S , of length N that is indexed from 0 to N - 1 , print its even-indexed and odd-indexed 
characters as 2 space-separated strings on a single line.
*/



import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("Give the string");
		str = input.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.print(" ");
		for(int i = 0; i < str.length(); i++) {
			if(i % 2 != 0) {
				System.out.print(str.charAt(i));
			}
		}
		
		System.out.println();
		input.close();

	}

}
