public class Lesson4 {
    public static void main(String[] args) throws Exception {
        // Functions

        // You can call a function like this
        // If it is void, no need to assign to a variable, you can just call it
        myFunction(); // This will run the code inside myFunction

        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfNumbers = sumOfIntArray(numbers); // Input the array declared above to be used in the function
        System.out.println(sumOfNumbers); // This outputs "55"
    }

    // A new function with no parameters
    public static void myFunction() {
        // This function has a type of "void", which means it does not return a value
        // For example this can print out "Hello"
        System.out.println("Hello");
    }

    // A new function that returns a value with parameters
    public static int sum(int a, int b) {
        return a + b; // The return keyword means to exit the function with the value provided
    }

    // A new function with parameters
    public static void printSum(int a, int b) {
        System.out.println(sum(a, b)); // You can call a function in a function
    }

    // More practical example
    public static int sumOfIntArray(int[] nums) {
        int sum = 0; // This sum variable cannot be accessed outside this sumOfIntArray function

        for (int i = 0; i < nums.length; i++) sum += nums[i];

        return sum;
    }
}