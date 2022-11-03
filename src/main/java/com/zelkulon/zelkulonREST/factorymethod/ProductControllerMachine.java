package com.zelkulon.zelkulonREST.factorymethod;

import com.zelkulon.zelkulonREST.prototyp.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductControllerMachine {
    @RequestMapping("/welcome")
    String welcomepage();

    @GetMapping("/{id}")
    ResponseEntity<Product> getProductById(@PathVariable(value = "id") Integer id);

    @GetMapping("/")
    ResponseEntity<List<Product>> getProducts();
}

