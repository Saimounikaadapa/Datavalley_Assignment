import java.util.Arrays;

public class ArrayOperations {
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 5, 7, 5, 9, 1, 5}; // Example array
        int numberToFind = 5; // Number to find in the array
        
        // Sorting the array
        Arrays.sort(arr);
        
        // Counting occurrences of the number
        int occurrences = countOccurrences(arr, numberToFind);
        
        // Displaying sorted array and number of occurrences
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }
    
    public static int countOccurrences(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }
}
