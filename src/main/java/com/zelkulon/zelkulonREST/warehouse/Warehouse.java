/**
 * Dastekin created on 15.11.2022 the Restaurant-Class inside the package - com.zelkulon.zelkulonREST.abstractfactory
 */
package com.zelkulon.zelkulonREST.warehouse;

import com.zelkulon.zelkulonREST.smartphone.Smartphone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    private Double rating = 0.0;

    @OneToMany(mappedBy = "warehouse")
    private List<Smartphone> smartphones;

}
