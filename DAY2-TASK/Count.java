package task.corejava;

import java.util.Scanner;

public class Count {
	public static boolean isVowel(char ch) {
		Character.toLowerCase(ch);
		return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=s.nextLine();
		int vowels=0,consonants=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)){
				if(isVowel(ch)) {
					vowels++;
					
				}else {
					consonants++;
				}
				
			}
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonants:"+consonants);
		s.close();
	}

}
