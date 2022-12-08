package com.zelkulon.zelkulonREST.port.product;

import com.zelkulon.zelkulonREST.smartphone.Smartphone;
import com.zelkulon.zelkulonREST.smartphone.SmartphoneRepository;
import com.zelkulon.zelkulonREST.warehouse.WarehouseRepository;
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
    public ResponseEntity<Smartphone> getFoodById(@PathVariable(value = "id") Long id) {
        Optional<Smartphone> product = this.smartphoneRepository.findById(id);
        return product.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());
    }

    @GetMapping("")
    public ResponseEntity<List<Smartphone>> getFoods() {
        return ResponseEntity.ok(this.smartphoneRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteFoodById(@PathVariable(value = "id") Long id) {
        Optional<Smartphone> product = this.smartphoneRepository.findById(id);
        this.smartphoneRepository.deleteById(id);
        return product.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());

    }


    @PostMapping(path = "")
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody @Valid Smartphone smartphone) {
        Smartphone saved = this.smartphoneRepository.save(smartphone);

        return ResponseEntity.ok(saved);
    }


}
