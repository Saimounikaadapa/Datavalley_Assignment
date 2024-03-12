public class MathOperations {
    
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method for adding three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // Method for concatenating two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Adding two integers
        int sum1 = math.add(5, 3);
        System.out.println("Sum of integers: " + sum1);
        
        // Adding three doubles
        double sum2 = math.add(2.5, 3.7, 1.2);
        System.out.println("Sum of doubles: " + sum2);
        
        // Concatenating two strings
        String result = math.add("Hello ", "World");
        System.out.println("Concatenated string: " + result);
    }
}
