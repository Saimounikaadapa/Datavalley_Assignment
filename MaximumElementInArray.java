public class MaximumElementInArray {
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 5, 7, 9, 1}; // Example array
        int max = findMaximum(arr);
        
        // Displaying the maximum element
        System.out.println("Maximum element in the array: " + max);
    }
    
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        
        int max = arr[0]; // Initialize max with the first element
        
        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
