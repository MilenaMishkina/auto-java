package practice_3;

public class MathConstants{
    final static double Pi = 3.14159;
    final static double E = 2.71828;

    public static double Square(double radius) {
        return Pi * Math.sqrt(radius);
    }

    public static double LengthCircle(double radius) {
        return 2* Pi * radius;
    }

    public static void main(String[] args) {
        System.out.println(MathConstants.LengthCircle(3.0));
        System.out.println(MathConstants.Square(3.0));

        System.out.println(MathConstants.LengthCircle(7.0));
        System.out.println(MathConstants.Square(7.0));

        Library newLibrary = new Library();
        newLibrary.category = "Test";
        System.out.println(newLibrary.category);
        newLibrary.author = "Author";
        System.out.println(newLibrary.author);
        newLibrary.year = 2025;
        System.out.println(newLibrary.year);

    }

}
