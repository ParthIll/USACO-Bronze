// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class shell {
	public static void main(String[] args) throws IOException {

		// Initialize the cups, cup 1 has the pebble at the start
		int[] cups = {1, 2, 3};

		// Scanner to read input from "shell.in"
		Scanner sigma = new Scanner(new File("shell.in"));
		System.out.println("");
		int swaps = sigma.nextInt(); // Number of swap/guess operations

		// Counters for correct guesses for each cup
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;

		// Process each swap and guess
		while(swaps != 0){
			int a = sigma.nextInt(); // First cup to swap
			int b = sigma.nextInt(); // Second cup to swap
			int g = sigma.nextInt(); // Guessed cup

			// Swap the cups
			int temp = cups[a-1];
			cups[a-1] = cups[b-1];
			cups[b-1] = temp;

			// Increment the counter if the guess is correct
			if(cups[g-1] == 1){
				c1++;
			}
			if(cups[g-1] == 2){
				c2++;
			}
			if(cups[g-1] == 3){
				c3++;
			}
			swaps--;
			//pw.println();
			/*a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());*/
		}
		// Find the maximum number of correct guesses
		int max = Math.max(Math.max(c1,c2),c3);

		// Write the result to "shell.out"
		PrintWriter out = new PrintWriter(new FileWriter("shell.out"));
		out.println(max);
		out.close();
		sigma.close();
	}
}
