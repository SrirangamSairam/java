import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Mobile",22500.0);
        Product product3 = new Product("Mobiile",22500.0);
        String text = "Hello";
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\anorak.act\\Desktop\testfile.txt"));
//        objectOutputStream.writeObject(product1);
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\anorak.act\\\\\\\\Desktop\\\\testfile3.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\anorak.act\\\\Desktop\\testfile.txt"));
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\anorak.act\\\\Desktop\\testfile1.txt"));
//            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\anorak.act\\\\Desktop\\testfile2.txt"));

            objectOutputStream.writeObject(product1);
            objectOutputStream1.writeObject(product3);
            fileOutputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("Hello after try catch");
    }
}
