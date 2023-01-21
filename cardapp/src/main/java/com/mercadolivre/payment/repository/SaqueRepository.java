package com.mercadolivre.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercadolivre.payment.entity.Saque;

public interface SaqueRepository extends JpaRepository<Saque, Long> {
 
    
}
