// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class shell {
	public static void main(String[] args) throws IOException {

		int[] cups = {1, 2, 3};

		/*BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int swaps = Integer.parseInt(st.nextToken());
		pw.println();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());*/
		Scanner sigma = new Scanner(new File("shell.in"));
		System.out.println("");
		int swaps = sigma.nextInt();

		int c1 = 0;
		int c2 = 0;
		int c3 = 0;

		while(swaps != 0){
			int a = sigma.nextInt();
			int b = sigma.nextInt();
			int g = sigma.nextInt();
			int temp = cups[a-1];
			cups[a-1] = cups[b-1];
			cups[b-1] = temp;
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
		int max = Math.max(Math.max(c1,c2),c3);
		PrintWriter out = new PrintWriter(new FileWriter("shell.out"));
		out.println(max);
		out.close();
		sigma.close();
	}
}
