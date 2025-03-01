package practice_2;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brandValue, double priceValue) {
        brand = brandValue;
        price = priceValue;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void printInfo() {
        System.out.println("Ноутбук: " + brand + ", " + "Цена: " + price);
    }

    public static void main(String[] args) {
        Laptop newLap = new Laptop("LENOVO", 90000);
        newLap.printInfo();

        newLap.setPrice(50000);
        newLap.printInfo();
    }
}
