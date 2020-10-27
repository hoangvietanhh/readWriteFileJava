import java.io.Serializable;

public class Product implements Serializable {
    int code;
    String name;
    double price;

    public Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
