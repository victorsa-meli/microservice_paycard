package com.mercadolivre.payment.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Saque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int estabelecimentoID;
    String nomeEstabelecimento;
    String descricaoProduto;
    Date dataCompra;
    Long numeroCartao;
    Double valor;
    Double cashback;
    Double taxa;

}