package com.zelkulon.zelkulonREST.smartphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {

    @Autowired
    SmartphoneRepository smartphoneRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Smartphone> getProductById(@PathVariable(value = "id") Long id) {
        Optional<Smartphone> product = this.smartphoneRepository.findById(id);
        return product.isEmpty()?ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());
    }


    @RequestMapping("/welcome")
    public String welcomepage() {
        return "Welcome to Zelkulon Rest ";
    }

    @GetMapping()
    public ResponseEntity<List<Smartphone>> getSmartphones() {
        return ResponseEntity.ok(this.smartphoneRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteById(@PathVariable(value = "id") Long id) {
        Optional<Smartphone> product = this.smartphoneRepository.findById(id);
        this.smartphoneRepository.deleteById(id);
        return product.isEmpty() ? ResponseEntity.notFound().build() :
                ResponseEntity.ok(product.get());
    }


    @PostMapping(path = "")
    public ResponseEntity<Smartphone> create(@RequestBody Smartphone smartphone) {
        Smartphone saved = this.smartphoneRepository.save(smartphone);

        return ResponseEntity.ok(saved);
    }


}
