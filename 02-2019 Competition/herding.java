// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;
import java.lang.Math;

public class herding {
	public static void main(String[] args) throws IOException {
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new FileWriter("herding.out"));
		Scanner sc = new Scanner(new File("herding.in"));
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		int dif1 = c2-c1;
		int dif2=c3-c2;
		int min=0;
		int biggestDif = Math.max(dif1,dif2);
		int max = biggestDif-1;
		if(dif1 == 1 && dif2 == 1){
			min = 0;
		}
		else if(dif1==2||dif2==2){
			min = 1;
		}
		else{
			min = 2;
		}

		pw.println(min);
		pw.println(max);
		/*
		 * Make sure to include the line below, as it
		 * flushes and closes the output stream.
		 */
		pw.close();
	}
}
