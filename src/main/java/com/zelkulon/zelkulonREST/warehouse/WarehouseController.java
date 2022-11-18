/**
 * Dastekin created on 15.11.2022 the WarehouseController-Class inside the package - com.zelkulon.zelkulonREST.warehouse
 */
package com.zelkulon.zelkulonREST.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    @Autowired
    WarehouseRepository warehouseRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> l(@PathVariable(value = "id") Long id) {
        Optional<Warehouse> product = this.warehouseRepository.findById(id);
        return product.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(product.get());
    }

    @GetMapping("")
    public ResponseEntity<List<Warehouse>> getWarehouses() {
        return ResponseEntity.ok(this.warehouseRepository.findAll());
    }
}
