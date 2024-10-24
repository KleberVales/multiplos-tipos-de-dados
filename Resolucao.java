import java.io.*; 
import java.util.*;

public class Solution { 
    private static void printArray(T[] t) { 
        for(T arr:t) { 
            System.out.println(arr); 
        } 
    } 
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        Solution.printArray(intArray);
        Solution.printArray(stringArray);
    }
}