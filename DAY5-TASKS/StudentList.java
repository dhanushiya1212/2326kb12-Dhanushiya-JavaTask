package task.corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    public static void main(String[] args) {
        
        ArrayList<String> students = new ArrayList<>();

        
        students.add("Dhanu");
        students.add("Subashini");
        students.add("Pooja");
        students.add("Mithuna");

        
        Iterator<String> iterator = students.iterator();

        
        System.out.println("Student Names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
