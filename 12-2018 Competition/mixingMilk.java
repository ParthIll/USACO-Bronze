// Arup Guha
// 2/2/2019
// Solution to 2019 USACO January Bronze Problem: Shell Game

import java.io.*;
import java.util.*;

public class mixingMilk {
	
	public static void main(String[] args) throws Exception {
		
		// Read input from "mixmilk.in"
		Scanner stdin = new Scanner(new File("mixmilk.in"));
		System.out.println("");
		// Read capacities and initial amounts for each bucket
		final int c1Capacity = stdin.nextInt();
		int c1Am = stdin.nextInt();
		final int c2Capacity = stdin.nextInt();
		int c2Am = stdin.nextInt();
		final int c3Capacity = stdin.nextInt();
		int c3Am = stdin.nextInt();

		// Arrays to store current amounts and capacities
		int[] amounts = new int[]{c1Am, c2Am, c3Am};
		int[] capacities = {c1Capacity,c2Capacity, c3Capacity};

		// Perform 3 pour operations as per the problem statement
		for(int i =0;i<=3;i++){
			int test= (i%3); // Current bucket index
			int j = test+1;  // Next bucket index
			if(test == 2){
				j=0; // Wrap around to first bucket
			} 

			// Calculate how much can be poured
			int dif = capacities[j]-amounts[j] ;
			dif = Math.min(dif,amounts[test]);
			amounts[test]-=dif;
			amounts[j]+=dif;
		}

		// Output the final amounts to "mixmilk.out"
		PrintWriter out = new PrintWriter(new FileWriter("mixmilk.out"));
		out.println(amounts[0]);
		out.println(amounts[1]);
		out.println(amounts[2]);
		stdin.close();
		out.close();
	}
}

