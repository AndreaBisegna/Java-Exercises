/*
HackerRank - Bubble Sort 
Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, 
print the following three lines:
Array is sorted in numSwaps swaps., where "numSwaps" is the number of swaps that took place.
First Element: firstElement, where "firstElement" is the first element in the sorted array.
Last Element: lastElement, where "lastElement" is the last element in the sorted array.

Hint: To complete this challenge, you must add a variable that keeps a running tally of all
swaps that occur during execution.
*/


import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("give the array's length");
		final int LENGTH = input.nextInt();
		
		int[] array = new int[LENGTH];
		
		System.out.println("give the values");
		
		for(int i = 0; i < LENGTH; i++) {
			array[i] = input.nextInt();
		}
		
		int swapNum = 0;
		
		int temp;
		
		for(int i = 0; i < array.length; i++) {
			int swapNumCurrent = 0;
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapNumCurrent++;
				}
			}
			
			if(swapNumCurrent == 0) {
				break;
			}
			
			swapNum += swapNumCurrent;
		}
		
		int firstElement = array[0];
		int lastElement = array[array.length-1];
		System.out.println("Array sorted in " + swapNum + " swaps.");
		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element: " + lastElement);


		input.close();
	}

}


