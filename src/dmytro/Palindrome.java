package dmytro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a word:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String word = reader.readLine();
			String lowercasedWord = word.toLowerCase();
			int length = word.length();
			int halfOfLength = length / 2;

			boolean isPalindrome = true;
			for (int i = 0; i < halfOfLength; i++) {
				if (lowercasedWord.charAt(i) != lowercasedWord.charAt(length - 1 - i)) {
					isPalindrome = false;
					break;
				}
			}

			System.out.println("The word \"" + word + "\" is " + (isPalindrome ? "" : "not ") + "a palindrome.");
		} catch (IOException e) {
			System.out.println("Cannot read a word");
		}

	}

}
