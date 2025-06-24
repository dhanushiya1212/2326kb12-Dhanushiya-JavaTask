package task.corejava;


	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class WriteFileExample {
	    public static void main(String[] args) {
	        String fileName = "output.txt"; 
	        try {
	            
	            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

	            
	            writer.write("This is the first line.");
	            writer.newLine();  
	            writer.write("This is the second line.");
	            writer.newLine();
	            writer.write("This is the third line.");
	            
	            
	            writer.close();

	            System.out.println("File written successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	    }
	}



