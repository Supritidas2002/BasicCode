public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 1; // Initialize a counter variable to start from 1
        int sum = 0; // Initialize a variable to store the sum

        // Use a while loop to iterate from 1 to 100
        while (n <= 100) {
            sum += n; // Add the current value of n to the sum
            n++; // Increment the counter variable
        }

        // Print the sum
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
