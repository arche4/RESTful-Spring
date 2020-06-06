package co.com.poli.servicesproduct.controller;

import co.com.poli.servicesproduct.domain.Category;
import co.com.poli.servicesproduct.domain.Products;
import co.com.poli.servicesproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Products> getProduct(@PathVariable("id") Long id) {
        Products products = productService.getProduct(id);
        if (products == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(products);
    }

    @GetMapping
    public ResponseEntity<List<Products>> getListProducts(@RequestParam(name = "categoryId", required = false) Long categoryId) {
        List<Products> products = new ArrayList<>();
        if (categoryId == null) {
            products = productService.listAllProducts();
            if (products.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
        } else {
            products = productService.findByCategory(Category.builder().id(categoryId).build());
            if (products.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<Products> createProduct(@RequestBody Products product) {
        Products productCreated = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productCreated);
    }

    @PutMapping ResponseEntity<Products> updateProducts(@RequestBody Products product){
        Products productUpdate = productService.updateProduct(product);
        if(productUpdate==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productUpdate);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Products> deleteProduct(@PathVariable("id") Long id){
        Products productDelete = productService.deleteProducts(id);
        if (productDelete==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productDelete);
    }

    @GetMapping(value = "/{id}/stock")
    public ResponseEntity<Products> updateStock(@PathVariable("id") Long id, @RequestParam(name = "quantity", required = true) Double quantity){
        Products productStock = productService.updateStock(id,quantity);
        if (productStock==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productStock);
    }

}