import java.util.Arrays;

public abstract class Shape {
    private double[] sides;
    private double[] angles;

    Shape(double[] sides, double[] angles) {
        this.sides = sides;
        this.angles = angles;
    }

    double[] getSides() {
        return this.sides;
    }

    void setSides(double[] newsides) {
        this.sides = newsides;
    }

    void setSide(int index, double newSide) {
        this.sides[index] = newSide;
    }

    double[] getAngles() {
        return this.angles;
    }

    void setAngles(double[] newAngles) {
        this.angles = newAngles;
    }

    void setAngle(int index, double newAngle) {
        this.angles[index] = newAngle;
    }
    
    double sidesSum() {
        return Arrays.stream(sides).sum();
    }

    double anglesSum() {
        return Arrays.stream(angles).sum();
    }
}
