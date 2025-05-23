// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Uddered {
	static int rounds = 1;

	public static int search(ArrayList<Character> a, char target){
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).equals(target)){
				return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Character> charList = new ArrayList<>();
		ArrayList<Character> heardList = new ArrayList<>();

		PrintWriter pw = new PrintWriter(System.out);

		Scanner input = new Scanner(System.in);

		String alphabet = input.nextLine();
		String heard = input.nextLine();

		for (char c : alphabet.toCharArray()) {
            charList.add(c);
        }

		for (char c : heard.toCharArray()) {
            heardList.add(c);
        }

		for(int i = 0; i < heardList.size() - 1; i++){
			if(search(charList,heardList.get(i+1))<=search(charList,heardList.get(i))){
				rounds++;
			}
		}

		pw.print(rounds);
		pw.close();
	}
}
