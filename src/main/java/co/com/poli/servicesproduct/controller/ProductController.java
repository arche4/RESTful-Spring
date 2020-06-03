package co.com.poli.servicesproduct.controller;

import co.com.poli.servicesproduct.domain.Products;
import co.com.poli.servicesproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Products> getProduct(@PathVariable("id") Long id){
        Products products = productService.getProduct(id);
        if (products==null){
            return ResponseEntity.notFound().build();
        }
           return ResponseEntity.ok(products);
    }
}
