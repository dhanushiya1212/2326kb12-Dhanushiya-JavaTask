package task.corejava;

import java.util.Scanner;

public class Student {
	String name;
    int rollNo;
    int mark1, mark2, mark3;

    
    public void inputDetails(Scanner sc) {
    	
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
        sc.nextLine(); 
    }

    
    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    
    public double getAverage() {
        return getTotal() / 3.0;
    }

    
    public void displayResult() {
        System.out.println("Student Result");
        System.out.println("Name:"+name);
        System.out.println("Roll No"+rollNo);
        System.out.println("Marks:" + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total:" + getTotal());
        System.out.println("Average:" + String.format("%.2f", getAverage()));
    }
}

 class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Student student = new Student();
        student.inputDetails(sc);
        student.displayResult();

        sc.close();
    }
}





