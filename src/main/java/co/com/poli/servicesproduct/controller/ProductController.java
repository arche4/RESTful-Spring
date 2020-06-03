package co.com.poli.servicesproduct.controller;


import co.com.poli.servicesproduct.domain.Productos;
import co.com.poli.servicesproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/producto")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value ="/{id}")
    public ResponseEntity<Productos> getProduct(Long id){
    Productos product = productService.getProductos(id);
    if(product==null){
        return ResponseEntity.notFound().build();
    }
     return ResponseEntity.ok(product);
}
}
