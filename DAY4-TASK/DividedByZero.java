package task.corejava;

import java.util.Scanner;

public class DividedByZero {
	 
		    public static void main(String args[]) {
		        Scanner s = new Scanner(System.in); 

		        System.out.println("Enter the number1: ");
		        int a = s.nextInt();

		        System.out.print("Enter the number2: ");
		        int b = s.nextInt();

		        try {
		            int result = a / b;
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Division by zero is not possible.");
		        }
                
		        
		        s.close();
		    
		}


}
