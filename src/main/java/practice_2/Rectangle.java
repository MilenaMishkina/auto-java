package practice_2;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int widthValue, int heightValue) {
        width = widthValue;
        height = heightValue;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle newRectangle = new Rectangle(5, 7);
        int firstRectangle = newRectangle.calculateArea();
        System.out.println("S of rectangle with width: " + newRectangle.width + " and height: " + newRectangle.height + " = " + firstRectangle );
        newRectangle.setWidth(16);
        int secondRectangle = newRectangle.calculateArea();
        System.out.println("S of rectangle with width: " + newRectangle.width + " and height: " + newRectangle.height + " = " + secondRectangle );
    }
}
