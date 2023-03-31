import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
//        ObjectInputStream objectInputStream1 = null;
        try (FileInputStream fileInputStream = new FileInputStream("C:\\\\\\\\Users\\\\\\\\anorak.act\\\\\\\\Desktop\\\\testfile3.txt")){
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\anorak.act\\\\Desktop\\testfile1.txt"));
//            objectInputStream1 = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\anorak.act\\\\Desktop\\testfile2.txt"));
            Product product2 = (Product) objectInputStream.readObject();
//            while (fileInputStream.available()>0) {
//                System.out.print((char) fileInputStream.read());
//            }
            System.out.println();
//            String message = objectInputStream1.readObject().toString();
            System.out.println(product2);
//            System.out.println(message);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
