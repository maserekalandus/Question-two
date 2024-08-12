/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package data.marathon;

/**
 *
 * @author LUBEGA
 */
public class Marathon {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", 
                          "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        // Array of times
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // Find the fastest and second fastest runners
        int firstIndex = 0;
        int secondIndex = 0;
        
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[firstIndex]) {
                secondIndex = firstIndex;
                firstIndex = i;
            } else if (times[i] < times[secondIndex] || firstIndex == secondIndex) {
                secondIndex = i;
            }
        }

        // Print the fastest runner
        System.out.println("Fastest Runner: " + names[firstIndex] + " - " + times[firstIndex] + " minutes");
        // Print the second fastest runner
        System.out.println("Second Fastest Runner: " + names[secondIndex] + " - " + times[secondIndex] + " minutes");
    }
}

