public class Lesson2 {
    public static void main(String[] args) throws Exception {
        // If statements

        // && AND gate
        // || OR gate
        // ! NOT gate

        // Number checking
        // == Check equal
        // != Check not equal
        // > Check greater than
        // < Check less than
        // >= Check greater than or equal to
        // <= Check less than or equal to

        // How to use an if statement
        /*
         * if (conditions) {
         * logic
         * }
         */

        // Optionally, you can chain if statements if the one before is not true
        /*
         * if (condition 1) {
         *  logic 1
         * } else if (condition 2) {
         *  logic 2
         * } else if (condition 3) {
         *  logic 3
         * } else {
         *  anything else
         * }
        */

        int x = 10;
        int y = 15;

        if (x == y) {
            // This code will not run because 10 is not equal to 15
            System.out.println("x is equal to y");
        } else if (x > y) {
            // This code will not run because 10 is less than 15
            System.out.println("x is greater than y");
        } else {
            // Anything else
            System.out.println("x is not equal to y and x is not greater than y");
        }

        // Another example

        int a = 3;
        int b = 3;

        if (!(a > b)) {
            // This code will run because a is not greater than b, but the "!" inverts the condition
            // In reality this is the same as a <= b
            System.out.println("a is not greater than b");
        }

        int c = 7;
        int d = 9;

        if (c == d || c < d) {
            // This code will run because only one of the two conditions needs to be met, in this case, 7 is less than 9, so it will run
            // In reality this is the same as c <= d
            System.out.println("c is equal or less than d"); 
        }

        int e = 3;
        int f = 9;

        if (e > 2 && f == 9) {
            // Both conditions need to be satisfied for this to be true
            System.out.println("e is greater than 2 and f is equal to 9");
        }

        // Chaining if statements
        if (e > 2) {
            System.out.println("e is less than 2"); // Only this code will run

            if (f < 9) {
                System.out.println("f is less than 9");
            }
        }

        // Switch cases

        int z = 5;

        // This sucks
        if (z == 1) {

        } else if (z == 2) {

        } else if (z == 3) {
            
        } else if (z == 4) {

        } else if (z == 5 || z == 6) {

        } else {

        }

        // Instead to this, this is more concise (and runs faster), best for numbers

        switch (z) {
            case (1): {
                // logic 1
                break;
            }
            case (2): {
                // logic 2
                break;
            }
            case (3): {
                // logic 3
                break;
            }
            case (4): {
                // logic 4
                break;
            }
            case (5):
            case (6): {
                // logic 5 AND 6
                break;
            }
            default: {
                // logic for anything else
                break;
            }
        }
    }
}
