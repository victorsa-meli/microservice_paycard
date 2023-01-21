package com.mercadolivre.payment.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/*  @Data é uma anotação que gera o código padronizado para classes Java: getters para todos os campos, setters para todos os campos não-finais e o toString apropriado, equals e implementações hashCode que envolvem os campos da classe. @byVictorsa-meli*/


@Data
@Entity
public class Cartao {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Long numeroCartao;
    private Double saldo;

    @Enumerated(EnumType.STRING)
    private TipoDoCartao tipo;


    /*A anotação @Enumerated é usada para mapear valores de enumeração para colunas de banco de dados. Isso significa que ela é usada para definir como os valores de uma propriedade de enumeração na sua classe de entidade serão armazenados em uma coluna específica na tabela do banco de dados correspondente.

    Quando você usa @Enumerated, pode especificar como os valores de enumeração serão armazenados na coluna, por meio de dois modos: Enumerated.Ordinal ou Enumerated.String.

    Enumerated.Ordinal armazena o índice numérico do valor de enumeração na coluna.

    Enumerated.String armazena a representação de string do valor de enumeração na coluna. 
    @byVictorsa-meli
    */
    
}
