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
public class ZelkulonRestApplication implements CommandLineRunner{

    private static Logger LOG = LoggerFactory
            .getLogger(SpringApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(ZelkulonRestApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Bean
    public CommandLineRunner demo(SmartphoneRepository smartphoneRepository, WarehouseRepository warehouseRepository) {
        return (args) -> {
            Warehouse warehouse = warehouseRepository.save(Warehouse.builder().name("LagerOne").build());
            smartphoneRepository.save(Smartphone
                    .builder()
                    .productNr(123032)
                    .productGroup(3)
                    .productModel("Samsung_s5")
                    .price(100)
                    .hasSdSlot(true)
                    .productBrand("Samsung")
                    .ean(312312412)
                    .tEan(312312412)
                    .productSpecs("LOG_TestProductSpecs")
                    .productDescription("LOG_TestProductDescription")
                    .warehouse(warehouse)
                    .build());

            smartphoneRepository.save(Smartphone
                    .builder()
                    .productNr(123034)
                    .productGroup(15)
                    .productModel("Samsung_s20")
                    .price(300)
                    .hasSdSlot(true)
                    .productBrand("Samsung")
                    .ean(512345123)
                    .tEan(512345123)
                    .productSpecs("LOG_TestProductSpecs")
                    .productDescription("LOG_TestProductDescription")
                    .warehouse(warehouse)
                    .build());

            smartphoneRepository.save(Smartphone
                    .builder()
                    .productNr(123035)
                    .productGroup(15)
                    .productModel("Samsung_s22")
                    .price(400)
                    .hasSdSlot(false)
                    .productBrand("Samsung")
                    .ean(942774135)
                    .tEan(942774135)
                    .productSpecs("LOG_TestProductSpecs")
                    .productDescription("LOG_TestProductDescription")
                    .warehouse(warehouse)
                    .build());

        };

    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
    }
}


