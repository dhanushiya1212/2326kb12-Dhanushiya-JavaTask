package task.corejava;

import java.util.Scanner;

public class Grading {
	public static double calculateAverage(int m1,int m2,int m3,int m4,int m5) {
		return(m1+m2+m3+m4+m5)/5;
	}
	public static String getGrade(double average) {
		if(average>=90) {
			return "A+";
		}else if(average>=80) {
			return "A";
	}else if(average>=70) {
		return "B";
	}else if(average>=60) {
		return "C";
	}else if(average>50){
		return "D";
	}else {
		return "F";
	}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks for 5 subject:");
		System.out.println("Subject 1-Tamil:");
		int mark1=s.nextInt();
		System.out.println("Subject 2-English:");
		int mark2=s.nextInt();
		System.out.println("Subject 3-Physics:");
		int mark3=s.nextInt();
		System.out.println("Subject 4-Chemistry:");
		int mark4=s.nextInt();
		System.out.println("Subject 5-Maths:");
		int mark5=s.nextInt();
		double average=calculateAverage(mark1,mark2,mark3,mark4,mark5);
		String grade=getGrade(average);
		System.out.println("Student result");
		
		System.out.printf("average:%2f",average);
		System.out.println("\nGrade"+grade);
		s.close();
		
		
		
		
		
	}

}
