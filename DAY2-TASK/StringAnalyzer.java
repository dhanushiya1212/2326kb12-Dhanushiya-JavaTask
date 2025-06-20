package task.corejava;

import java.util.Scanner;

public class StringAnalyzer {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input=s.nextLine();
		String[] words=input.split("\\s+");
		int wordCount=words.length;
		int charCount=input.replace("", "").length();
		String reversed=new StringBuilder(input).reverse().toString();
		String longestWord="";
		for(String word:words) {
			if(word.length()>longestWord.length()) {
				longestWord=word;
			}
			s.close();
		}
		System.out.println("Word count:"+wordCount);
		System.out.println("CharacterCount:"+charCount);
		System.out.println("Reversed String:"+reversed);
		System.out.println("LongestWord:"+longestWord);
	}


}
