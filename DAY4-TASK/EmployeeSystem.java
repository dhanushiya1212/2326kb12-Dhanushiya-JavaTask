package task.corejava;

	import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	

	public class EmployeeSystem {
	    static final String FILE_NAME = "employees.txt";

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Employee Record System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View All Employees");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1: addEmployee(sc); break;
	                case 2: viewEmployees(); break;
	                case 3: updateEmployee(sc); break;
	                case 4: deleteEmployee(sc); break;
	                case 0: System.out.println("Exiting..."); break;
	                default: System.out.println("Invalid choice!");
	            }

	        } while (choice != 0);

	        sc.close();
	    }

	    static void addEmployee(Scanner sc) {
	        try (FileWriter fw = new FileWriter(FILE_NAME, true);
	             BufferedWriter bw = new BufferedWriter(fw)) {

	            System.out.print("Enter ID: ");
	            String id = sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Department: ");
	            String dept = sc.nextLine();
	            System.out.print("Enter Salary: ");
	            String salary = sc.nextLine();

	            bw.write(id + "," + name + "," + dept + "," + salary);
	            bw.newLine();

	            System.out.println("Employee added.");

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    static void viewEmployees() {
	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            System.out.println("\nEmployee Records:");
	            while ((line = br.readLine()) != null) {
	                String[] emp = line.split(",");
	                System.out.printf("ID: %s | Name: %s | Dept: %s | Salary: %s%n", emp[0], emp[1], emp[2], emp[3]);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file.");
	        }
	    }

	    static void updateEmployee(Scanner sc) {
	        System.out.print("Enter Employee ID to update: ");
	        String targetId = sc.nextLine();
	        List<String> updatedLines = new ArrayList<>();
	        boolean found = false;

	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] emp = line.split(",");
	                if (emp[0].equals(targetId)) {
	                    found = true;
	                    System.out.println("Enter new details:");
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Department: ");
	                    String dept = sc.nextLine();
	                    System.out.print("Salary: ");
	                    String salary = sc.nextLine();
	                    updatedLines.add(emp[0] + "," + name + "," + dept + "," + salary);
	                } else {
	                    updatedLines.add(line);
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file.");
	            return;
	        }

	        if (found) {
	            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
	                for (String l : updatedLines) {
	                    bw.write(l);
	                    bw.newLine();
	                }
	                System.out.println("Employee updated.");
	            } catch (IOException e) {
	                System.out.println("Error writing file.");
	            }
	        } else {
	            System.out.println("Employee ID not found.");
	        }
	    }

	    static void deleteEmployee(Scanner sc) {
	        System.out.print("Enter Employee ID to delete: ");
	        String targetId = sc.nextLine();
	        List<String> updatedLines = new ArrayList<>();
	        boolean found = false;

	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] emp = line.split(",");
	                if (!emp[0].equals(targetId)) {
	                    updatedLines.add(line);
	                } else {
	                    found = true;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file.");
	            return;
	        }

	        if (found) {
	            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
	                for (String l : updatedLines) {
	                    bw.write(l);
	                    bw.newLine();
	                }
	                System.out.println("Employee deleted.");
	            } catch (IOException e) {
	                System.out.println("Error writing file.");
	            }
	        } else {
	            System.out.println("Employee ID not found.");
	        }
	    }
	}



