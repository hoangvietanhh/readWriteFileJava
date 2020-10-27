import java.io.*;
import java.util.ArrayList;

public class Main {

    private static final String filePath = "obj.dat";
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product(1,"Aplle",1000);
        Product product2 = new Product(2,"Nokia",1500);

        products.add(product1);
        products.add(product2);

        writeToFile(products);

        ArrayList<Product> listProducts = (ArrayList<Product>)readFromFile(filePath);
        for (Product p : listProducts){
            System.out.println(p.code + p.name + p.price);
        }
    }

    public static void writeToFile(Object o){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(o);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFromFile(String filePath){
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            objectInputStream.close();
            return o;

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
}
