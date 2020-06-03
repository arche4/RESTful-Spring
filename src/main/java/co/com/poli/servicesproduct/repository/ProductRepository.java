package co.com.poli.servicesproduct.repository;

import co.com.poli.servicesproduct.domain.Category;
import co.com.poli.servicesproduct.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products,Long> {


    public List<Products> findByCategory(Category category);
}
