package com.sairam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\anorak.act\\Desktop/test.txt"));
        Product product3 = (Product) objectInputStream.readObject();
        System.out.println(product3);
        objectInputStream.close();
    }
//    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\anorak.act\\\\Desktop/test1.txt");
//        Scanner scanner = new Scanner(fileInputStream);
//        String text = scanner.nextLine();
//        System.out.println(text);
////        while (fileInputStream.available()>0) {
////            System.out.print((char) fileInputStream.read());
////        }
//        fileInputStream.close();
//    }
}
