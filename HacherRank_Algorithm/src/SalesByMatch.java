/*
HacherRank Algorithm
Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. 
Given an array of integers representing the color of each sock, determine how many pairs 
of socks with matching colors there are.
For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2] . There is one pair of color 1 and 
one of color 2. 
There are three odd socks left, one of each color. The number of pairs is .

*/

//Andrea Bisegna


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SalesByMatch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int socks;
		
		Map<Integer, Integer> colorCounts = new TreeMap<>();
		System.out.println("Give the socks");
		socks = input.nextInt();

		System.out.println("Give the colors");
		for(int i = 0; i < socks; i++) {
			int color = input.nextInt();
			if(!colorCounts.containsKey(color)) {
				colorCounts.put(color, 1);
			}
			else {
				int oldCount = colorCounts.get(color);
				colorCounts.put(color, oldCount + 1);
			}
		}
		
		System.out.println(colorCounts);
		int pairs = 0;
		
		for(Map.Entry<Integer, Integer> entry : colorCounts.entrySet()) {
			int sockCount = entry.getValue();
			pairs += sockCount / 2;
		}
	     input.close();
	 }
}


