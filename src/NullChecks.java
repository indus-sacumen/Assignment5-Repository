// Java program to avoid NullPointerException 
// using Optional Class 

import java.util.Optional;

public class NullChecks {
    public static void main(String[] args)
    {

        // Create a String of size 10 
        String[] string = new String[10];

        // Create an Optional Class instance 
        // and get the state for a[1] element 
        // for Null value 
        Optional<String> check = Optional.ofNullable(string[1]);

        // If the value in the current instance is null, 
        // it will return false, else true 
        if (check.isPresent()) {

            // The String is empty 
            // So a[1] will have null at present 
            String upcase = string[1].toUpperCase();
            System.out.print(upcase);
        }
        else

            // As the current value is null 
            System.out.println("String value is not present");
    }
} 