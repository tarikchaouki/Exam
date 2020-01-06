package training;

import java.util.*; 
import java.util.concurrent.*; 
  
// A class to represent a student. 
class Student { 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                   String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " "
            + this.name + " "
            + this.address; 
    } 
} 
  
// Comparator implementattion 
class Sortbyroll implements Comparator<Student> { 
  
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.rollno - b.rollno; 
    } 
} 
  
public class  Question3{ 
  
    static void Example2ndConstructor() 
    { 
        // Creating an empty TreeMap 
        TreeMap<Student, Integer> tree_map 
            = new TreeMap<Student, Integer>(new Sortbyroll()); 
  
        // Mapping string values to int keys 
        tree_map.put(new Student(111, "lenon", "maths"), 45); 
        tree_map.put(new Student(131, "james", "IT"), 38); 
        tree_map.put(new Student(121, "david", "geography"), 60); 
  
        // Displaying the TreeMap 
        System.out.println("TreeMap: "
                           + tree_map); 
    } 
  
    public static void main(String[] args) 
    { 
  
        System.out.println("TreeMap using "
                           + "TreeMap(Comparator)"
                           + " constructor:\n"); 
        Example2ndConstructor(); 
    } 
} 
