package com.zelkulon.zelkulonREST.port.product;

import com.zelkulon.zelkulonREST.core.domain.model.Smartphone;
import com.zelkulon.zelkulonREST.core.domain.service.interfaces.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
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
