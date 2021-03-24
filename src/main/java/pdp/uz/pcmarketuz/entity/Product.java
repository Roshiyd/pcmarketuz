package pdp.uz.pcmarketuz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String model;
    private String description;
    @OneToOne
    private Attachment attachment;
    private String price;
    @ManyToOne
    private Category category;
    private boolean active = false;
    @OneToOne
    private Characteristics characteristics;
}
