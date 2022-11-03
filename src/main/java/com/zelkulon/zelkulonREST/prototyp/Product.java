/**
 * 11 Model.values()
 */
package com.zelkulon.zelkulonREST.prototyp;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
        @CsvBindByName
        private int id;

        @CsvBindByName
        private long productNr;

        @CsvBindByName
        private int productGroup;

        @CsvBindByName
        private String productModel;

        @CsvBindByName
        private float price;

        @CsvBindByName
        private boolean hasSdSlot;

        @CsvBindByName
        private String productBrand;

        @CsvBindByName
        private long ean;

        @CsvBindByName
        private long tEan;

        @CsvBindByName
        private String productSpecs;

        @CsvBindByName
        private String productDescription;


}
