package co.com.poli.servicesproduct.service;

import co.com.poli.servicesproduct.domain.Categoria;
import co.com.poli.servicesproduct.domain.Productos;

import java.security.PublicKey;
import java.util.List;

public interface ProductService {
    public List<Productos> ListAllProductos();
    public Productos getProductos(Long id);
    public Productos crearProducto(Productos producto);
    public Productos modificar(Productos producto);
    public Productos eliminar(Long id);
    public List<Productos> findByCategoria(Categoria categoria);
    public Productos actualizarStock(Long id, Double valor);

}
