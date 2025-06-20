package task.corejava;
import java.util.Scanner;

public class Reversed {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the number:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Reversed array:");
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]+"");
		}
	}

}
