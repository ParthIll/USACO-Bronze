// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Abc {
	public static void main(String[] args) throws IOException {
		// Scanner to read input from standard input
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums= new ArrayList<Integer>();	

		// Read 7 integers from input
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
	
		// Add all numbers to the list
		nums.add(a);
		nums.add(b);
		nums.add(c);
		nums.add(d);
		nums.add(e);
		nums.add(f);
		nums.add(g);

		// Find the smallest number (trueA)
		int trueA=Integer.MAX_VALUE;
		int trueB=Integer.MAX_VALUE;
		int trueC=Integer.MIN_VALUE;
		int index = 0;

		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) < trueA){
				trueA = nums.get(i);
				index = i;
			}
		}
		
		// Remove the smallest number from the list
		nums.remove(index);

		// Find the next smallest number (trueB)
		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) < trueB){
				trueB = nums.get(i);
			}
		}
		
		// Find the largest number (trueC)
		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) > trueC){
				trueC = nums.get(i);
			}
		}

		// Calculate the third original number
		trueC = trueC-(trueA+trueB);

		// Output the three original numbers
		PrintWriter pw = new PrintWriter(System.out);
		pw.print(trueA + " ");
		pw.print(trueB + " ");
		pw.print(trueC);

		pw.close();
	}
}
