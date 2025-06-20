package task.corejava;

import java.util.Scanner;

public class AddressBook{
    public static void main(String[] args) {
    	
    	 Scanner s = new Scanner(System.in);
        String[] contacts = new String[2];

        
        for (int i = 0; i < contacts.length; i++) {
            System.out.println("Enter details for contact " + (i + 1));

            System.out.print("Enter Name: ");
            String name = s.nextLine();

            System.out.print("Enter Email: ");
            String email = s.nextLine();

            System.out.print("Enter Mobile No: ");
            String mobile = s.nextLine();

            
            contacts[i] =" name "+name+ "," + "email "+email+ "," + "mobile"+mobile;
            
        }
        
        System.out.println("Contact List");
        
		for (int i = 0; i < contacts.length; i++) {
            System.out.println("Contact " + (i + 1));
            
			System.out.println((i+1)+","+contacts[i]);
        }

        
    }
}

