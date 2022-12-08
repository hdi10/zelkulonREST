package com.zelkulon.zelkulonREST;

import com.zelkulon.zelkulonREST.core.domain.model.Smartphone;
import com.zelkulon.zelkulonREST.core.domain.model.Warehouse;
import com.zelkulon.zelkulonREST.core.domain.service.interfaces.WarehouseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.zelkulon.zelkulonREST.core.domain.service.interfaces.SmartphoneRepository;


@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ZelkulonRestApplication{

    //private static Logger LOG = LoggerFactory
      //      .getLogger(SpringApplication.class);

    public static void main(String[] args) {
        //LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(ZelkulonRestApplication.class, args);
        //LOG.info("APPLICATION FINISHED");
    }


    @Bean
    public CommandLineRunner runner1(SmartphoneRepository smartphoneRepository, WarehouseRepository warehouseRepository) {
        return (args) -> {
            Warehouse warehouse = warehouseRepository.save(Warehouse.builder().name("thisTestOne")
                    .build());

          smartphoneRepository.save(Smartphone
                  .builder()
                  .name("Chicken Boneless (ohne Knochen)")
                  .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
                  .currency("EUR")
                  .category("food")
                  .price(12.50F)
                  .warehouse(warehouse)
                  .build());
            smartphoneRepository.save(Smartphone
                    .builder()
                    .name("Chicken Cuts (mit Knochen)")
                    .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
                    .currency("EUR")
                    .category("food")
                    .price(12.00F)
                    .warehouse(warehouse)
                    .build());
            smartphoneRepository.save(Smartphone
                    .builder()
                    .name("Beef Dumpling")
                    .description("BBQ Beef Fried Dumpling (4 PCS)")
                    .currency("EUR")
                    .category("side")
                    .price(6.50F)
                    .warehouse(warehouse)
                    .build());
    };

    }
}
//    @Bean
//    public CommandLineRunner demo(SmartphoneRepository smartphoneRepository, WarehouseRepository warehouseRepository) {
//        return (args) -> {
//            Warehouse warehouse = warehouseRepository.save(Warehouse.builder().name("LagerOne").build());
//            smartphoneRepository.save(Smartphone
//                    .builder()
//                    .name("Chicken Boneless (ohne Knochen)")
//                    .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
//                    .currency("EUR")
//                    .category("food")
//                    .price(12.50F)
//                    .warehouse(warehouse)
//                    .build());
//
//            smartphoneRepository.save(Smartphone
//                    .builder()
//                    .name("Chicken Cuts (mit Knochen)")
//                    .description("1) Plain no sauce 2) Sweet chili (Peanut topping) 3) Soy garlic 4) Super spicy 5) Soy wasabi")
//                    .currency("EUR")
//                    .category("food")
//                    .price(12.00F)
//                    .warehouse(warehouse)
//                    .build());
//
//            smartphoneRepository.save(Smartphone
//                    .builder()
//                    .name("Beef Dumpling")
//                    .description("BBQ Beef Fried Dumpling (4 PCS)")
//                    .currency("EUR")
//                    .category("side")
//                    .price(6.50F)
//                    .warehouse(warehouse)
//                    .build());
//
//        };
//
//    }





