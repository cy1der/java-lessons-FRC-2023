public class Lesson1 {
    public static void main(String[] args) throws Exception {
        // Basic data types

        // How to initialize a variable
        // type name = value;
        // OR
        // type name;

        // Number types
        
        // Integer - int
        int age = 16;
        
        // Float - float
        float x = 1.1f;

        // Double - double
        double y = 1.01;

        // Boolean

        // true or false (0-1)
        boolean bool = true;
        boolean bool2 = false;
        
        // Invert boolean
        bool2 = !bool;

       // Character - char
       char a = 'a'; // Characters use single quotes

       // String - String
       // String is basically a array of chars
       String str = "12345abcde";  // Strings use double quotes

       String stringWithNewline = "Hello\nhello";
       /*
        * This will print as:
        Hello
        hello
       */

       String stringWithTabs = "Hello\tHello";
       /*
        * This will print as:
        Hello   Hello
        */

        // Math

        // Increment by 1
        age++;

        // Decrement by 1
        age--;

        // This is the same as:
        age = age + 1;
        age = age - 1;
        // or
        age += 1; // This is more concise
        age -= 1;

        // Multiply

        age = age * 2;
        // or
        age *= 2;

        // Divide

        age = age / 2;
        age /= 2;

        // Power

        double newAge = Math.pow(age, 2); // age^2
        double newAge2 = Math.pow(age, age); // age to the power of age (big number)

        // Square Root

        double newAge3 = Math.sqrt(age); // sqrt(age)

        // Absolute value
        double newAge5 = Math.abs(age);

        // Doing math on variables using another variable
        // Example:
        int a = 10;
        int b = 5;

        a += b; // 10 + 5
        a -= b; // 15 (10 + 5) - 5
    }
}