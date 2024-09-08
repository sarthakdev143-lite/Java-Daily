// Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

// It should remove all values from list a, which are present in list b keeping their order.
// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

// If a value is present in b, all of its occurrences must be removed from the other:
// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

// https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Arraydiff {
    // Method to implement the arrayDiff function
    public static int[] arrayDiff(int[] a, int[] b) {
        // Convert array 'a' to a List for dynamic removal of elements
        List<Integer> listA = new ArrayList<>();
        for (int value : a) {
            listA.add(value);
        }

        for (int valueB : b) {
            listA.removeIf(val -> val == valueB); 
        }

        // Convert the list back to an array and return it
        return listA.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 2, 3 };
        int[] b = { 2 };
        int[] result = arrayDiff(a, b);
        
        // Print result to verify
        System.out.println(Arrays.toString(result)); // Output: [1, 3]
    }
}
