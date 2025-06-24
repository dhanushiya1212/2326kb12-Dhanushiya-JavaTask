package task.corejava;


	import java.io.*;

	public class ResultProcesser {
	    public static void main(String[] args) {
	        String inputFile = "marks.csv";
	        String outputFile = "results.csv";

	        try (
	            BufferedReader br = new BufferedReader(new FileReader(inputFile));
	            PrintWriter pw = new PrintWriter(new FileWriter(outputFile))
	        ) {
	            String line = br.readLine(); // Read header
	            pw.println("ID,Name,Total,Average,Result");

	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");

	                String id = data[0];
	                String name = data[1];

	                int maths = Integer.parseInt(data[2]);
	                int science = Integer.parseInt(data[3]);
	                int english = Integer.parseInt(data[4]);

	                int total = maths + science + english;
	                double average = total / 3.0;

	                String result = (maths >= 40 && science >= 40 && english >= 40) ? "Pass" : "Fail";

	                pw.printf("%s,%s,%d,%.2f,%s\n", id, name, total, average, result);
	            }

	            System.out.println("Result file written successfully: " + outputFile);

	        } catch (IOException e) {
	            System.out.println("Error reading or writing file: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format in input file.");
	        }
	    }
	}



