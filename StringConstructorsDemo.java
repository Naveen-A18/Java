//Implement a java program to illustrate the use of different types of string class constructors. 

public class StringConstructorsDemo { 
    public static void main(String[] args) { 
        // Constructor 1: Creating a string using a string literal 
        String strLiteral = "Hey, Acharya!"; 
        System.out.println("String created using a string literal: " +       strLiteral); 
 
        // Constructor 2: Creating a string from a character array 
        char[] charArray = {'A', 'c', 'h', 'a', 'r', 'y', 'a'}; 
        String strFromArray = new String(charArray); 
        System.out.println("String created from a character array: " + strFromArray); 
 
        // Constructor 3: Creating a string from a subset of a character array 
        String strFromArraySubset = new String(charArray, 0, 3); // Start from index 0 and take 3 
characters 
        System.out.println("String created from a subset of a character array: " + strFromArraySubset); 
 
        // Constructor 4: Creating a string from another string 
        String originalStr = "Information Science and Engineering"; 
        String copiedStr = new String(originalStr); 
        System.out.println("String created from another string: " + copiedStr); 
