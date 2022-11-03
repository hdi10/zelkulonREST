package com.zelkulon.zelkulonREST.productcontrollersmoketests;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.zelkulon.zelkulonREST.prototyp.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductRepository pR;

    @RequestMapping("/welcome")
    public String welcomepage() {
        return "Welcome to Yawin Tutor";
    }

    @GetMapping("/{id}")
    public ResponseEntity<com.zelkulon.zelkulonREST.prototyp.Product> getProductById(@PathVariable(value = "id") Integer id) {
        com.zelkulon.zelkulonREST.prototyp.Product p = this.pR.findById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(this.pR.findAll());
    }

    //TODO
    @PostMapping("/")
    public Product addProduct(JSONWrappedObject jsonWrappedObject){
        return null;
    }

    @DeleteMapping ("/{id}")
    public void deleteProduct(@PathVariable(value = "id") Integer id){

    }

}
