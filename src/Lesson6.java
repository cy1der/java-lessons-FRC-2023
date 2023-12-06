public class Lesson6 {
    public static void main(String[] args) throws Exception {
        // Classes - Inheritance

        // A class can inherit everything inside another class

        double[] sides = new double[] {10, 10, 10};
        double[] angles = new double[] {60, 60, 60};
        double[] angles2 = new double[] {61, 59, 70};

        Triangle triangle = new Triangle(sides, angles);
        Triangle invalidTriangle = new Triangle(sides, angles2);

        System.out.println(triangle.validateAngles());
        System.out.println(invalidTriangle.validateAngles());
    }
}