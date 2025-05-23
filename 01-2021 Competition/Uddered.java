// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.*;

public class Uddered {
	static int rounds = 1; // Number of rounds needed

	// Helper function to find the index of a character in the alphabet list
	public static int search(ArrayList<Character> a, char target){
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).equals(target)){
				return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Character> charList = new ArrayList<>(); // Custom alphabet
		ArrayList<Character> heardList = new ArrayList<>(); // Word to spell

		PrintWriter pw = new PrintWriter(System.out);

		Scanner input = new Scanner(System.in);

		String alphabet = input.nextLine(); // Read custom alphabet
		String heard = input.nextLine();    // Read heard word

		// Convert alphabet and heard word to character lists
		for (char c : alphabet.toCharArray()) {
            charList.add(c);
        }

		for (char c : heard.toCharArray()) {
            heardList.add(c);
        }

		// Count rounds: increment when next char is before or same as previous in alphabet
		for(int i = 0; i < heardList.size() - 1; i++){
			if(search(charList,heardList.get(i+1))<=search(charList,heardList.get(i))){
				rounds++;
			}
		}

		pw.print(rounds); // Output the number of rounds
		pw.close();
	}
}
