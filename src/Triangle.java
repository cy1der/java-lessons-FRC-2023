public class Triangle extends Shape {
    Triangle(double[] sides, double[] angles) {
        super(sides, angles);
    }

    boolean validateAngles() {
        return this.getAngles().length == 3 && this.anglesSum() == 180;
    }
}
