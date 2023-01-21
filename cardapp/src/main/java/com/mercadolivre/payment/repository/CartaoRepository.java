package com.mercadolivre.payment.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mercadolivre.payment.entity.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long>{

    Optional<Cartao> buscaPorNumero(Long numero);

    /*A classe java.util.Optional é uma classe que foi introduzida no Java 8 para trabalhar com valores que podem ser nulos de forma mais segura e concisa. Ela fornece métodos para lidar com valores que podem ser nulos, sem precisar usar verificações explícitas de nulidade.@victorsa-meli

    Ao invés de trabalhar com um valor primitivo ou objeto diretamente, você usa uma instância de Optional para encapsular o valor. Isso permite que você chame métodos como get(), isPresent() e orElse() sem ter que se preocupar em verificar se o valor é nulo. @victorsa-meli*/


}
    

