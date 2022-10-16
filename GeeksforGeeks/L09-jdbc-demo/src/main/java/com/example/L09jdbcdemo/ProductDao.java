package com.example.L09jdbcdemo;

import com.example.L09jdbcdemo.models.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ProductDao {
    public Product createProduct(Product product) {
        Connection con;
        try {
            con = DriverManager.getConnection("http://localhost:8080/phpmyadmin/index.php?route=/sql&pos=0&db=jdbc_demo&table=product","root","");
            String query = "insert into product values(NULL,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }
}
