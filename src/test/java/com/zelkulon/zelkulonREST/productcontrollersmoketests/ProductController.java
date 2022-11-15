//package com.zelkulon.zelkulonREST.productcontrollersmoketests;
//
//import com.fasterxml.jackson.databind.util.JSONWrappedObject;
//import com.zelkulon.zelkulonREST.smartphone.Smartphone;
//import com.zelkulon.zelkulonREST.smartphone.SmartphoneRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//    @Autowired
//    SmartphoneRepository pR;
//
//    @RequestMapping("/welcome")
//    public String welcomepage() {
//        return "Welcome to Yawin Tutor";
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Smartphone> getProductById(@PathVariable(value = "id") Integer id) {
//        Smartphone p = this.pR.findById(id);
//        return p == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(p);
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<List<Smartphone>> getProducts() {
//        return ResponseEntity.ok(this.pR.findAll());
//    }
//
//
//    @PostMapping("/")
//    public Smartphone addProduct(JSONWrappedObject jsonWrappedObject){
//        return null;
//    }
//
//    @DeleteMapping ("/{id}")
//    public void deleteProduct(@PathVariable(value = "id") Integer id){
//
//    }
//
//}
