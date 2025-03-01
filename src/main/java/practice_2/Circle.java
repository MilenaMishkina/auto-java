package practice_2;

public class Circle {
    double radius;

    public Circle(double radiusValue) {
        radius = radiusValue;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double calculateArea() {
        double result = Math.PI * (radius * radius);
        System.out.println("calculateArea = " + result);
        return result;
    }

    public double calculateCircumference() {
        double result = 2 * Math.PI * radius;
        System.out.println("calculateArea = " + result);
        return result;
    }

    public static void main(String[] args) {
        Circle newCircle = new Circle(5);
        newCircle.calculateArea();
        newCircle.calculateCircumference();

        newCircle.setRadius(9);
        newCircle.calculateArea();
        newCircle.calculateCircumference();
    }
}
