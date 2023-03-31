import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductListDemo {
    public static void main(String[] args) {
        writeObjectToFile();
        readObjectToFile();
    }
    public static void writeObjectToFile() {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product("Mobile", 100.0);
        Product product2 = new Product("Lapy", 1000.0);
        Product product3 = new Product("USB", 10.0);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        ProductList productList = new ProductList(list);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\\\\\\\Users\\\\\\\\anorak.act\\\\\\\\Desktop\\\\Plist.txt"));
            objectOutputStream.writeObject(productList);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void readObjectToFile() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\\\\\\\Users\\\\\\\\anorak.act\\\\\\\\Desktop\\\\Plist.txt"));
            ProductList productList = (ProductList) objectInputStream.readObject();
            System.out.println(productList);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
