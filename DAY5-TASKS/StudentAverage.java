package task.corejava;
import java.util.HashMap;
import java.util.Map;

public class StudentAverage {
    public static void main(String[] args) {
        // Create a HashMap to store student name -> marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Add student names and their marks
        studentMarks.put("dhanu", 98);
        studentMarks.put("Samitha", 90);
        studentMarks.put("maaya", 88);
        studentMarks.put("Kanishka", 92);

        // Display each student and their marks
        System.out.println("Student Marks:");
        int total = 0;
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            total += entry.getValue();
        }

        // Compute and display the average
        double average = (double) total / studentMarks.size();
        System.out.println("Average Marks: " + average);
    }
}
