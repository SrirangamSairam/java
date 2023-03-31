package com.example.L09Springjdbcdemo.dao;

import com.example.L09Springjdbcdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Product createProduct(Product product) {
//        String query = "insert into Product values(NULL,'"+product.getName()+"',"+product.getPrice()+")";
        String query = "insert into Product values(NULL,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,product.getName());
            ps.setDouble(2,product.getPrice());
            return ps;
        },keyHolder);
        product.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return product;
    }

    public List<Product> getProductsByName(String name) {
        List<Product> products = new ArrayList<>();
        String query = "select * from Product where name LIKE ?";
        PreparedStatementSetter preparedStatementSetter = ps -> ps.setString(1,"%"+name+"%");
        RowMapper<Product> productRowMapper = new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                return product;
            }
        };
        products = jdbcTemplate.query(query,preparedStatementSetter,productRowMapper);
        return products;
    }
}
