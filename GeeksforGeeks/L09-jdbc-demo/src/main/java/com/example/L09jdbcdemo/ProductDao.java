package com.example.L09jdbcdemo;

import com.example.L09jdbcdemo.models.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {
    public Product createProduct(Product product) {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","");
            String query = "insert into product values(NULL,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.execute();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                product.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    public List<Product> getProductsByName(String name) {
        List<Product> products = new ArrayList<>();
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","");
            String query = "select * from product where name like ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, "%"+name+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
