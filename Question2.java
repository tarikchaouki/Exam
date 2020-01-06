package training;


	
	import java.util.*; 
	import java.util.concurrent.*; 
	  
	public class Question2 { 
	  
	    // Function to show TreeMap() constructor example 
	    static void Example1stConstructor() 
	    { 
	        // Creating an empty TreeMap 
	        TreeMap<Integer, String> tree_map 
	            = new TreeMap<Integer, String>(); 
	  
	        // Mapping string values to int keys 
	        tree_map.put(123, "james"); 
	        tree_map.put(454, "nick"); 
	        tree_map.put(900, "will"); 
	        tree_map.put(322, "mat"); 
	        tree_map.put(122, "mark"); 
	  
	        // Displaying the TreeMap 
	        System.out.println("TreeMap: "
	                           + tree_map); 
	    } 
	 
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        System.out.println("TreeMap using "
	                           + "TreeMap() constructor:\n"); 
	        Example1stConstructor(); 
	    } 
	
	}
	