package com.zelkulon.zelkulonREST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductRepository pR;

    @GetMapping("/{id}")
    public ResponseEntity<com.zelkulon.zelkulonREST.productcontrollersmoketests.Product> getProductById(@PathVariable(value = "id") Integer id) {
        com.zelkulon.zelkulonREST.productcontrollersmoketests.Product p = this.pR.findById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }

    @GetMapping("/")
    public ResponseEntity<List<com.zelkulon.zelkulonREST.productcontrollersmoketests.Product>> getProducts() {
        return ResponseEntity.ok(this.pR.findAll());
    }
}
