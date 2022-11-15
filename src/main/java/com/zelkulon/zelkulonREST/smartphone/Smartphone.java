/**
 * 11 Model.values()
 */
package com.zelkulon.zelkulonREST.smartphone;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zelkulon.zelkulonREST.warehouse.Warehouse;
import lombok.*;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Builder
@Data

@Table(appliesTo = "Smartphone", comment = "Smartphone")
public class Smartphone {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "productNr")
        private long productNr;


        @Column(name = "productGroup")
        private int productGroup;



        @Column(name ="productModel")
        private String productModel;

        @Column(name = "price")
        private float price;

        @Column(name = "hasSdSlot")
        private boolean hasSdSlot;

        @Column(name = "productBrand")
        private String productBrand;

        @Column(name = "ean")
        private long ean;

        @Column(name = "tEan")
        private long tEan;

        @Column(name = "productSpecs")
        private String productSpecs;

        @Column(name = "productDescription")
        private String productDescription;

        @ManyToOne
        @JoinColumn(name = "warehouse_id", nullable=false)
        @JsonIgnore
        private Warehouse warehouse;

}
