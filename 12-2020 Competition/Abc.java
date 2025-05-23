// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Abc {
	public static void main(String[] args) throws IOException {
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(System.out);
		

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums= new ArrayList<Integer>();	

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
	
		nums.add(a);
		nums.add(b);
		nums.add(c);
		nums.add(d);
		nums.add(e);
		nums.add(f);
		nums.add(g);

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
		
		nums.remove(index);

		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) < trueB){
				trueB = nums.get(i);
			}
		}
		
		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) > trueC){
				trueC = nums.get(i);
			}
		}

		trueC = trueC-(trueA+trueB);
		PrintWriter pw = new PrintWriter(System.out);
		pw.print(trueA + " ");
		pw.print(trueB + " ");
		pw.print(trueC);

		pw.close();
	}
}
