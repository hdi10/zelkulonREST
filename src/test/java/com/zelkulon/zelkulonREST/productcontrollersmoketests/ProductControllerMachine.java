/*
package com.zelkulon.zelkulonREST.productcontrollersmoketests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface ProductControllerMachine {

    //
   // ResponseEntity<Product> getProductById();

    @GetMapping("/{id}")
    ResponseEntity<Product> getProductById(@PathVariable(value = "id") Integer id);
    @GetMapping("/")
    ResponseEntity<List<Product>> getProducts();



}
*/
