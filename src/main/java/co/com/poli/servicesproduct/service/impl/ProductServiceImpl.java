package co.com.poli.servicesproduct.service.impl;

import co.com.poli.servicesproduct.domain.Categoria;
import co.com.poli.servicesproduct.domain.Productos;
import co.com.poli.servicesproduct.repository.ProductRepositorio;
import co.com.poli.servicesproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositorio productRepositorio;

    @Override
    public List<Productos> ListAllProductos() {
        return productRepositorio.findAll();
    }

    @Override
    public Productos getProductos(Long id) {
        return productRepositorio.findById(id).orElse(null);
    }

    @Override
    public Productos crearProducto(Productos producto) {
        producto.setStatus("CREATED");
        return productRepositorio.save(producto);
    }

    @Override
    public Productos modificar(Productos producto) {
        return productRepositorio.save(producto);
    }

    @Override
    public Productos eliminar(Long id) {
        return null;
    }

    @Override
    public List<Productos> findByCategoria(Categoria categoria) {
        return productRepositorio.findByCategoria(categoria);
    }

    @Override
    public Productos actualizarStock(Long id, Double valor) {
        Productos productoBD = getProductos(id);
        if(productoBD== null){
            return null;
        }
        productoBD.setStock(productoBD.getStock()+valor);
        return productRepositorio.save(productoBD);

    }
}
