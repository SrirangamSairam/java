package com.example.L08JDBCdemo.services;

import com.example.L08JDBCdemo.dao.ProductDao;
import com.example.L08JDBCdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product addProduct(Product product) {
        return productDao.createProductPreparedStatement(product);
    }

    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }
}
