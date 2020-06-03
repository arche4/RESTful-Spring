package co.com.poli.servicesproduct.repository;


import co.com.poli.servicesproduct.domain.Categoria;
import co.com.poli.servicesproduct.domain.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositorio extends JpaRepository<Productos,Long> {

    public List<Productos> findByCategoria(Categoria categoria);


}
