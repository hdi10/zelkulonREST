package com.zelkulon.zelkulonREST.abstractfactory;

import com.opencsv.bean.CsvToBeanBuilder;
import com.zelkulon.zelkulonREST.prototyp.Product;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> phoneList;

    public ProductRepository() {
        this.initPhoneList();
    }

    private void initPhoneList() {
        try {
            URL url = getClass().getClassLoader().getResource("phones.csv");
            String csv_path = url.getPath().toString();
            this.phoneList = new CsvToBeanBuilder(new FileReader(csv_path))
                    .withType(Product.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            this.phoneList = new LinkedList<Product>();
        }
    }

    public Product findById(Integer id) {
        return this.phoneList
                .stream()
                .filter(product -> product.getId() == id)
                .findAny()
                .orElse(null);
    }

    public List<Product> findAll() {
        return this.phoneList;
    }

}
