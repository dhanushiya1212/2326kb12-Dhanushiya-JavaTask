package task.corejava;
import java.util.Scanner;

public class Spliting {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String sentence=s.nextLine();
		String[] words=sentence.split("");
		System.out.println("The words in a sentence are:");
		for(String word:words){
		System.out.println(word);
		}
		s.close();
		}


}
