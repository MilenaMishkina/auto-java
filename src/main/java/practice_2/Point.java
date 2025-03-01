package practice_2;

public class Point {
    int x;
    int y;

    public Point(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void print() {
        System.out.println("Координаты: x = " + x + ", " + "y = " + y);
    }

    public static void main(String[] args) {
        Point newPoint = new Point(9, 1);
        newPoint.print();

        newPoint.setX(5);
        newPoint.print();
    }
}
