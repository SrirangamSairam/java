package com.example.L09springbootdemo.dao;

import com.example.L09springbootdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository("productDao")
public class ProductDao implements IProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    private RowMapper<Product> rowMapper = new RowMapper<Product>() {
//        @Override
//        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Product product = new Product();
//            product.setId(rs.getInt(1));
//            product.setName(rs.getString(2));
//            product.setPrice(rs.getDouble(3));
//            return product;
//        }
//    };

    @Autowired
    private RowMapper<Product> rowMapper;

    @Override
    public List<Product> getProductsByName(String name) {
        String query = "select * from product where name LIKE ?";
        PreparedStatementSetter preparedStatementSetter = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1,"%"+name+"%");
            }
        };
        return jdbcTemplate.query(query, preparedStatementSetter, rowMapper);
    }

    @Override
    public Product createProduct(Product product) {
        String query = "insert into product values(NULL,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            return ps;
        },keyHolder);
        product.setId(keyHolder.getKey().intValue());
        return product;
    }
}
