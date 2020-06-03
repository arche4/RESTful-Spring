package co.com.poli.servicesproduct.services.impl;

import co.com.poli.servicesproduct.domain.Category;
import co.com.poli.servicesproduct.domain.Products;
import co.com.poli.servicesproduct.repository.ProductRepository;
import co.com.poli.servicesproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Products> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Products createProduct(Products products) {
        return productRepository.save(products);
    }

    @Override
    public Products updateProduct(Products products) {
        return null;
    }

    @Override
    public Products deleteProducts(Products products) {
        return null;
    }

    @Override
    public List<Products> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Products updateStock(Long id, Double quantity) {
        Products productsDB = getProduct(id);
        if (productsDB==null){
            return null;
        }
        productsDB.setStock(productsDB.getStock()+quantity);
        return productRepository.save(productsDB);
    }
}
