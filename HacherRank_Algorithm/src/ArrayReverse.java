/*
Andrea Bisegna - Exercise reverse an array
*/

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = readArrayOfIntegers();
		int k = array.length;
			
		for(int i = k-1; i >= 0; i--) {
		 System.out.print(array[i] + " ");
		}
			
    	System.out.println(" ");
	}
	
	public static int[] readArrayOfIntegers() {
		Scanner input = new Scanner(System.in);
		System.out.println("give the array's length");
		final int LENGTH = input.nextInt();
		int[] array = new int[LENGTH];
		
		System.out.println("give the values");
		for(int i = 0; i < LENGTH; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}
}
