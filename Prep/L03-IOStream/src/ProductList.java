import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList implements Serializable {

    @Serial
    private static final long serialVersionUID = 11L;
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
    private void writeObject(ObjectOutputStream out) throws IOException {
        for(Product product: productList) {
            String data = product.getName() + ", " + product.getPrice()+"\n";
            out.write(data.getBytes());
        }
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        ProductList productList1 = (ProductList) in.readObject();
        Scanner scanner = new Scanner(in);
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] arr = data.split(",");
            String name = arr[0];
            Double price = Double.valueOf(arr[1]);
            Product product = new Product(name, price);
            if(productList == null) {
                productList = new ArrayList<>();
            }
            productList.add(product);
        }
    }
}
