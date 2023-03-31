package com.example.L08JDBCdemo.dao;

import com.example.L08JDBCdemo.models.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ProductDao {
    public Product createProductStatement(Product product) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pre", "root", "");
            Statement statement = con.createStatement();
            String query = "insert into Product values(NULL,'" + product.getName() + "'," + product.getPrice() + ")";
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Product createProductPreparedStatement(Product product) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pre", "root", "");
            String query = "insert into Product values(NULL,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.execute();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if(generatedKeys.next())
                product.setId(generatedKeys.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public Product getProductById(int id) {
        Connection con = null;
        Product product = new Product();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pre", "root", "");
            String query = "select * from Product where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product.setId(resultSet.getInt(1));
                product.setName(resultSet.getString(2));
                product.setPrice(resultSet.getDouble(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return product;
    }
}
