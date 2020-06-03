package co.com.poli.servicesproduct.domain;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
