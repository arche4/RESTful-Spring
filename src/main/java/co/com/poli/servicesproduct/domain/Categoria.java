package co.com.poli.servicesproduct.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="tbl_categorias")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
