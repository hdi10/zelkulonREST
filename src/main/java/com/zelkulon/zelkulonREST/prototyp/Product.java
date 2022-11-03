/**
 * 11 Model.values()
 */
package com.zelkulon.zelkulonREST.prototyp;

import com.opencsv.bean.CsvBindByName;
import lombok.*;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(appliesTo = "Smartphone", comment = "Smartphone")
public class Product {

        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        @CsvBindByName
        private Integer id;

        @Column(name = "productNr")
        @CsvBindByName
        private long productNr;

        @Column(name = "productGroup")
        @CsvBindByName
        private int productGroup;

        @Column(name ="productModel")
        @CsvBindByName
        private String productModel;

        @Column(name = "price")
        @CsvBindByName
        private float price;

        @Column(name = "hasSdSlot")
        @CsvBindByName
        private boolean hasSdSlot;

        @Column(name = "productBrand")
        @CsvBindByName
        private String productBrand;

        @Column(name = "ean")
        @CsvBindByName
        private long ean;

        @Column(name = "tEan")
        @CsvBindByName
        private long tEan;

        @Column(name = "productSpecs")
        @CsvBindByName
        private String productSpecs;

        @Column(name = "productDescription")
        @CsvBindByName
        private String productDescription;


}
