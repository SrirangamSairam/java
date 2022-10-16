package com.sairam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList implements Serializable {
    @Serial
    private static final long serialVersionUID = 102483920495L;
    private List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        for(Product product: productList) {
            String data = "\n" + product.getName() + ", " + product.getPrice();
            objectOutputStream.write(data.getBytes());
        }
    }

    @Serial
    private void readObject(ObjectInputStream objectInputStream) {
        Scanner scanner = new Scanner(objectInputStream);
        while(scanner.hasNext()) {
            String data = scanner.nextLine();
            System.out.println(data);
            String[] arr = data.split(",");
            System.out.println(arr.length);
            String name = arr[0];
            double price = Double.parseDouble(arr[1]);
            Product product = new Product(name,price);
            if(productList == null) {
                productList = new ArrayList<>();
            }
            productList.add(product);
        }
    }
}
