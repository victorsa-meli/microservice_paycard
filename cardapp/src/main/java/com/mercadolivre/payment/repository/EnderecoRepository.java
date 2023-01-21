package com.mercadolivre.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercadolivre.payment.entity.Endereco;

public interface EnderecoRepository  extends JpaRepository<Endereco, Long>{

    
}
