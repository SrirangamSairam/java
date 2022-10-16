package com.sairam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product("Laptop", 80000.0);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\anorak.act\\Desktop/test.txt"));
        objectOutputStream.writeObject(product1);
        objectOutputStream.close();
    }
//    public static void main(String[] args) throws IOException {
//        String text = "How are you?";
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\Users\\\\anorak.act\\\\Desktop/test1.txt",true);
//        fileOutputStream.write(text.getBytes());
//        fileOutputStream.close();
//    }
}
