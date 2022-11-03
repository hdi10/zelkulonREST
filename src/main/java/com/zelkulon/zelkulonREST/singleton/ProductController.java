package com.zelkulon.zelkulonREST.singleton;

import com.zelkulon.zelkulonREST.abstractfactory.ProductRepository;
import com.zelkulon.zelkulonREST.prototyp.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.zelkulon.zelkulonREST.factorymethod.ProductControllerMachine;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
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

    @PostMapping(path = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> create(@RequestBody Product newProduct) {
        //Product p = Productservice.save(newProduct);
//        if (p == null) {
//            throw new ServerException();
//        } else {
//            return new ResponseEntity<>(p, HttpStatus.CREATED);
//        }
        return null;
    }

    @DeleteMapping("/hello/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        return "Delete by id called";
    }
}
