package practice_2;

public class Product {
    String name;
    double price;

    public Product(String nameValue, double priceValue) {
        name = nameValue;
        price = priceValue;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double discount) {
        price -= (discount/100) * price;
    }

    public void printInfo() {
        System.out.println("Товар: " + name + ", " + "Цена: " + price);
    }

    public static void main(String[] args) {
        Product newProduct = new Product("TV", 100);
        newProduct.printInfo();

        newProduct.setPrice(200);
        newProduct.printInfo();
        newProduct.applyDiscount(50);
        newProduct.printInfo();
    }
}
