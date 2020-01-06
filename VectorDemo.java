package training;
import java.util.*; 

public class VectorDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty Vector 
        Vector<String> vec_tor = new Vector<String>(); 
  
        // Use add() method to add elements into the Vector 
        vec_tor.add("Welcome"); 
        vec_tor.add("To"); 
        vec_tor.add("the"); 
        vec_tor.add("best"); 
        vec_tor.add("IT school"); 
       vec_tor.add("in the world");
        // Displaying the Vector 
        System.out.println("Vector: " + vec_tor); 
  
        // Inseting element at 3rd position 
        vec_tor.insertElementAt("tekarch", 3); 
  
         vec_tor.removeElementAt(6);
       
  
        // Displaying the final Vector 
        System.out.println("The final vector is " + vec_tor); 
    } 
} 