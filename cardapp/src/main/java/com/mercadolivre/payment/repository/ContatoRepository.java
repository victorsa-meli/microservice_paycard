package com.mercadolivre.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercadolivre.payment.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

    
}
