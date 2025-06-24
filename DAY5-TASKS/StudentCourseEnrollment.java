package task.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StudentCourseEnrollment {

    static ArrayList<String> students = new ArrayList<>();

    
    static HashMap<String, List<String>> studentCourses = new HashMap<>();

    
    public static void addStudent(String name, List<String> courses) {
        students.add(name);
        studentCourses.put(name, new ArrayList<>(courses));
        System.out.println("Student " + name + " added with courses: " + courses);
    }

   
    public static void removeStudent(String name) {
        students.remove(name);
        studentCourses.remove(name);
        System.out.println("Student " + name + " removed.");
    }

    
    public static void displayAllStudents() {
        System.out.println("\n--- Enrolled Students and Courses ---");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            List<String> courses = studentCourses.get(student);
            System.out.println("Student: " + student + " | Courses: " + courses);
        }
    }

    
    public static void main(String[] args) {
        
        addStudent("Alice", Arrays.asList("Math", "Science"));
        addStudent("Bob", Arrays.asList("History", "English"));
        addStudent("Charlie", Arrays.asList("Math", "Computer Science"));

       
        displayAllStudents();

        
        removeStudent("Bob");

        
        displayAllStudents();
    }
}
	


