package com.zelkulon.zelkulonREST.singleton;

import com.zelkulon.zelkulonREST.abstractfactory.ProductRepository;
import com.zelkulon.zelkulonREST.prototyp.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.zelkulon.zelkulonREST.factorymethod.ProductControllerMachine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController implements ProductControllerMachine{
    @Autowired
    ProductRepository pR;

    @Override
    @RequestMapping("/welcome")
    public String welcomepage() {
        return "Welcome to Zelkulon Rest ";
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Integer id) {
        Product p = this.pR.findById(id);
        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
    }
    @Override
    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts() { return ResponseEntity.ok(this.pR.findAll());
    }


}
