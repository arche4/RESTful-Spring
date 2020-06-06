package co.com.poli.servicesproduct.services;

import co.com.poli.servicesproduct.domain.Category;
import co.com.poli.servicesproduct.domain.Products;
import co.com.poli.servicesproduct.repository.ProductRepository;

import java.util.List;

public interface ProductService {

    public List<Products> listAllProducts();
    public Products getProduct(Long id);
    public Products createProduct(Products products);
    public Products updateProduct(Products products);
    public Products deleteProducts(Long id);
    public List<Products> findByCategory(Category category);
    public Products updateStock(Long id, Double quantity);
}
