package com.sairam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductListDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectInFile();
        readObjectFromFile();
    }

    public static void writeObjectInFile() throws IOException {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("Laptop",80000);
        Product product2 = new Product("Mobile",40000.0);
        Product product3 = new Product("Tablet",75000.5);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        ProductList productLists = new ProductList(productList);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\anorak.act\\Desktop/productList.txt"));
        objectOutputStream.writeObject(productLists);
    }

    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\anorak.act\\Desktop/productList.txt"));
        ProductList productList = null;
        productList = (ProductList) objectInputStream.readObject();
        System.out.println(productList);
    }

}
