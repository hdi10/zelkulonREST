package com.zelkulon.zelkulonREST.productcontrollersmoketests;

import com.zelkulon.zelkulonREST.prototyp.Product;
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
}
