package com.example.L09springbootdemo.dao;

import com.example.L09springbootdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository("productDaoNamed")
public class ProductNamedDao implements IProductDao{

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private RowMapper<Product> rowMapper;
    @Override
    public List<Product> getProductsByName(String name) {
        String query = "select * from product where name like :name";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("name", "%"+name+"%");
        return namedParameterJdbcTemplate.query(query,parameterSource,rowMapper);
    }

    @Override
    public Product createProduct(Product product) {
        String query = "insert into product values (NULL, :name, :price)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("name", product.getName());
        parameterSource.addValue("price", product.getPrice());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(query,parameterSource,keyHolder);
        product.setId(Objects.requireNonNull(keyHolder.getKey()).intValue()); //objects.requireNotNull is used for warning
        return product;
    }
}
