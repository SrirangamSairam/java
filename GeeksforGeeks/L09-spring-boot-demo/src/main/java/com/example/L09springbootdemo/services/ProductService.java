package com.example.L09springbootdemo.services;

import com.example.L09springbootdemo.dao.IProductDao;
import com.example.L09springbootdemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

//    @Autowired
//    private ProductDao productDao;
//
//    @Autowired
//    private ProductNamedDao productNamedDao;

    @Autowired
    @Qualifier("productDaoNamed")
    private IProductDao iProductDao;
    public Product createProduct(Product product) {
        return iProductDao.createProduct(product);
    }

//    public Product createNamedProduct(Product product) {
//        return productNamedDao.createProduct(product);
//    }

    public List<Product> getProductByName(String keyword) {
        return iProductDao.getProductsByName(keyword);
    }
}
