//package com.zelkulon.zelkulonREST.factorymethod;
//
//import com.zelkulon.zelkulonREST.smartphone.Smartphone;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//public interface ProductControllerMachine {
//    @RequestMapping("/welcome")
//    String welcomepage();
//
//    @GetMapping("/{id}")
//    ResponseEntity<Smartphone> getProductById(@PathVariable(value = "id") Long id);
//
//    @GetMapping("/")
//    ResponseEntity<List<Smartphone>> getProducts();
//}
//
