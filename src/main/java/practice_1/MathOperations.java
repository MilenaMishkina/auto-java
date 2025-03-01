package practice_1;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x-y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        int subtractValue = subtract(x, y);
        return Math.abs(subtractValue);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        double hypotenuse = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(hypotenuse);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit)  {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int sumXAndY = add(1, 2);
        System.out.println("Sum of x and y = " + sumXAndY);

        int subtractXAndY = subtract(1, 8);
        System.out.println("Subtract of x and y = " + subtractXAndY);

        int multiplyXAndY = multiply(2, 5);
        System.out.println("Multiply of x and y = " + multiplyXAndY);

        double divideXAndY = divide(8.124, 5);
        System.out.println("Divide of x and y = " + divideXAndY);

        int maxValue = findMax(10, 5);
        System.out.println("Max value = " + maxValue);

        int differenceValue = difference(1, 8);
        System.out.println("Difference between x and y = " + differenceValue);

        int squareAreaValue = squareArea(8);
        System.out.println("Square area = " + squareAreaValue);

        int squarePerimeterValue = squarePerimeter(8);
        System.out.println("Square area = " + squarePerimeterValue);

        int minutes = convertSecondsToMinutes(180);
        System.out.println("Seconds converted to minutes = " + minutes);

        double averageSpeedValue = averageSpeed(10.5, 3);
        System.out.println("Avarage speed value = " + averageSpeedValue);

        double hypotenuse = findHypotenuse(8, 2);
        System.out.println("Hypotenuse = " + hypotenuse);

        double circleCircumferenceValue = circleCircumference(5.1933);
        System.out.println("Circle circumference value = " + circleCircumferenceValue);

        double percentage = calculatePercentage(8.123, 1.2);
        System.out.println("Percentage value = " + percentage);

        double fahrenheit = celsiusToFahrenheit(123);
        System.out.println("Fahrenheit value = " + fahrenheit);

        double celsius = fahrenheitToCelsius(321);
        System.out.println("Celsius value = " + celsius);
    }
}
