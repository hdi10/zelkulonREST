package com.zelkulon.zelkulonREST.core.domain.service.interfaces;

import com.zelkulon.zelkulonREST.core.domain.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
