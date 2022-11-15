/**
 * 11 Model.values()
 */
package com.zelkulon.zelkulonREST.smartphone;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zelkulon.zelkulonREST.warehouse.Warehouse;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Smartphone {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @NotBlank(message = "Name is mandatory")
        private int productNr;

        @NotBlank(message = "productGroup is mandatory")
        @Column(name = "productGroup")
        private int productGroup;


        @NotBlank(message = "productModel is mandatory")
        @Column(name ="productModel")
        private String productModel;

        @Positive(message = "Price needs to be positive")
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
