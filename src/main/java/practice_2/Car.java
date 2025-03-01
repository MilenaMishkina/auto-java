package practice_2;

public class Car {
    String brand;
    int year;

    public Car(String brandName, int yearValue){
        brand = brandName;
        year = yearValue;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public void print(){
        System.out.println("Марка: " + brand + "," + "Год выпуска: " + year);
    }

    public static void main(String[] args) {
        Car example = new Car("VOLVO", 2000);
        example.print();
        example.setYear(1997);
        example.print();
    }
}
