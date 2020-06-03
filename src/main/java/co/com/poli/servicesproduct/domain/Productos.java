package co.com.poli.servicesproduct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="tbl_productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Productos implements Serializable {

    private static final long serialUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double stock;
    private Double price;
    private String Status;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name= "categorias_id")
    private  Categoria categoria;

}
