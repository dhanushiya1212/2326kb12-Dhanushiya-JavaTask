package task.corejava;

import java.util.HashSet;

public class UniqueEmails {
    public static void main(String[] args) {
        
        HashSet<String> emailAddresses = new HashSet<>();

        
        emailAddresses.add("dhanu@gmail.com");
        emailAddresses.add("mithuna@gmail.com");
        emailAddresses.add("pooja@gmail.com");
        emailAddresses.add("subashini@.com"); 

        
        System.out.println("Unique Email Addresses:");
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
