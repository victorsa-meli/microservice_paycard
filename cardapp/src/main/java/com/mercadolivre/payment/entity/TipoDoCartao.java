package com.mercadolivre.payment.entity;

import lombok.Getter;

@Getter
public enum TipoDoCartao {

    ALIMENTACAO(1),
    FARMACIA(2),
    COMBUSTIVEL(3),
    ;

    int codigo;

    TipoDoCartao(int codigo){
        this.codigo = codigo;
    }
}
