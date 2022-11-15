package com.zelkulon.zelkulonREST;

import com.zelkulon.zelkulonREST.smartphone.SmartphoneRepository;
import com.zelkulon.zelkulonREST.smartphone.Smartphone;
import com.zelkulon.zelkulonREST.warehouse.Warehouse;
import com.zelkulon.zelkulonREST.warehouse.WarehouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ZelkulonRestApplication{

    public static void main(String[] args) {
        SpringApplication.run(ZelkulonRestApplication.class, args);
    }

    @Bean
    public CommandLineRunner zelkulonRest(SmartphoneRepository smartphoneRepository, WarehouseRepository warehouseRepository) {
        return (args) -> {
            Warehouse warehouse = warehouseRepository.save(Warehouse.builder().name("LagerOne").build());
            smartphoneRepository.save(Smartphone
                    .builder()
                    .name("Chicken Boneless (ohne Knochen)")
                    .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
                    .currency("EUR")
                    .category("food")
                    .price(12.50F)
                    .warehouse(warehouse)
                    .build());
//                    .builder()
//                    .productNr(1232)
//                    .productGroup(3)
//                    .productModel("Samsung_s5")
//                    .price(100F)
//                    //.hasSdSlot(true)
//                    //.productBrand("Samsung")
//                    //.ean(312312412)
//                    //.tEan(312312412)
//                    //.productSpecs("LOG_TestProductSpecs")
//                    //.productDescription("LOG_TestProductDescription")
//                    .warehouse(warehouse)
//                    .build());

            smartphoneRepository.save(Smartphone
                    .builder()
                    .name("Chicken Cuts (mit Knochen)")
                    .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
                    .currency("EUR")
                    .category("food")
                    .price(12.00F)
                    .warehouse(warehouse)
                    .build());
//                    .builder()
//                    .productNr(1234)
//                    .productGroup(15)
//                    .productModel("Samsung_s20")
//                    .price(300F)
////                    .hasSdSlot(true)
////                    .productBrand("Samsung")
////                    .ean(512345123)
////                    .tEan(512345123)
////                    .productSpecs("LOG_TestProductSpecs")
////                    .productDescription("LOG_TestProductDescription")
//                    .warehouse(warehouse)
//                    .build());

            smartphoneRepository.save(Smartphone
                    .builder()
                    .name("Beef Dumpling")
                    .description("BBQ Beef Fried Dumpling (4 PCS)")
                    .currency("EUR")
                    .category("side")
                    .price(6.50F)
                    .warehouse(warehouse)
                    .build());
//                    .builder()
//                    .productNr(1230)
//                    .productGroup(15)
//                    .productModel("Samsung_s22")
//                    .price(400F)
////                    .hasSdSlot(false)
////                    .productBrand("Samsung")
////                    .ean(942774135)
////                    .tEan(942774135)
////                    .productSpecs("LOG_TestProductSpecs")
////                    .productDescription("LOG_TestProductDescription")
//                    .warehouse(warehouse)
//                    .build());

        };

    }


}


