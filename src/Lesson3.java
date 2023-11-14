public class Lesson3 {
    public static void main(String[] args) throws Exception {
        // Arrays & Loops

        // Arrays
        int[] arrayOfInts = new int[5]; // Empty array of 5 integers
        arrayOfInts = new int[] { 1, 2, 3, 4, 5 }; // Set the values of the array

        // Accessing the inner values of the array
        // Index the array starting at 0
        int one = arrayOfInts[0];

        String[] arrayOfStrings = new String[] { "Hello", "this", "is", "a", "string", "array!" };

        // Getting the length of the array
        int stringsArrayLength = arrayOfStrings.length; // This returns 6 (starting at 1)
        String lastStringOfArray = arrayOfStrings[stringsArrayLength - 1]; // Get the last element of an array without
                                                                           // hardcoding (subtract 1 from length because
                                                                           // array indices start at 0!)

        // Loops
        // Loop notation
        /*
         * for (initial value; condition (just like an if statement); increment) {
         * logic
         * }
         */

        // Typical loop for a whole array
        for (int i = 0; i < stringsArrayLength; i++) {
            String currentString = arrayOfStrings[i]; // This gets the element of the array
            System.out.println(currentString);
        }

        // The previous loop prints:
        /*
         * Hello
         * this
         * is
         * a
         * string
         * array!
         */

        // More practical use of a loop

        int[] nums = new int[] { 2, 3, 4, 5 };

        // nums[0] += 1;
        // nums[1] += 1;
        // nums[2] += 2;

        // That is not an efficient way of doing things

        // Instead, you can loop
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }

        // This increments every number in nums by 1 automatically
    }
}