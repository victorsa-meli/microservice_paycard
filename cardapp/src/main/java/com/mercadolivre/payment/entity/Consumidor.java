package com.mercadolivre.payment.entity;


//Importação de dependências

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

/*  @Data é uma anotação que gera o código padronizado para classes Java: getters para todos os campos, setters para todos os campos não-finais e o toString apropriado, equals e implementações hashCode que envolvem os campos da classe. @byVictorsa-meli 

@EqualsAndHashCode em Java é usada para gerar automaticamente métodos equals e hashCode para uma classe. Esta anotação é fornecida pela biblioteca de anotações do lombok e é útil para evitar a escrita de código duplicado para esses métodos comuns. Ela pode ser adicionada à classe para gerar esses métodos automaticamente quando o código é compilado. @byVictorsa-meli
 */


@Data
@Entity
@EqualsAndHashCode
public class Consumidor {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int numeroDocumento;
    private Data dataNascimento;


    //Contatos

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "contato_id", referencedColumnName = "id")
    private Contato contato;
    

    //Endereco
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;


    //Cartoes
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "consumidor_id")
    private Set<Cartao> listaCartao;

/*  A anotação @JoinColumn em Java é usada para mapear uma chave estrangeira de uma tabela de banco de dados para uma propriedade de uma entidade Java. Ela é usada em conjunto com o JPA (Java Persistence API) para mapear relacionamentos entre entidades. @byVictorsa-meli

Essa anotação é colocada acima de uma propriedade de entidade que representa a chave estrangeira na tabela de banco de dados. Ela especifica o nome da coluna na tabela de banco de dados que contém a chave estrangeira e pode ser usada para especificar outras configurações, como a ação de atualização e exclusão em cascata.
________________________________________
@OneToMany é uma anotação JPA (Java Persistence API) que é usada para mapear um relacionamento de um para muitos entre duas entidades. Ela é colocada na entidade que possui o relacionamento e especifica a entidade associada. @byVictorsa-meli

Neste exemplo, a classe Department possui uma lista de Employee, ou seja, o relacionamento é de um para muitos, onde uma instância de Department pode ter vários Employee, e o atributo "mappedBy" especifica que o relacionamento é gerenciado pela entidade Employee. @byVictorsa-meli

@OneToMany(mappedBy = "department")
private List<Employee> employees;

_________________________________________

Já a anotação @OneToOne é usada para mapear um relacionamento de um para um entre duas entidades. Ela é colocada na entidade que possui o relacionamento e especifica a entidade associada. @byVictorsa-meli

@OneToOne
@JoinColumn(name = "employee_id")
private Employee employee;

Neste exemplo, a classe EmployeeDetail possui uma relação de um para um com Employee, onde uma instância de EmployeeDetail possui uma instância de Employee, e a anotação @JoinColumn especifica a coluna "employee_id" na tabela EmployeeDetail que contém a chave estrangeira para a entidade Employee.@byVictorsa-meli
_________________________________________

CascadeType.PERSIST é um dos valores possíveis da enumeração javax.persistence.CascadeType. Ele indica que as operações de persistência (inserção) devem ser propagadas para entidades associadas. Isso significa que se uma entidade pai for persistida (inserida), as entidades filhas associadas também serão persistidas automaticamente. @byVictorsa-meli

Além de PERSIST, existem outros valores possíveis para CascadeType, como MERGE, REFRESH, REMOVE, DETACH e ALL. Cada um deles representa uma operação diferente (atualizar, excluir, desanexar, etc.) e pode ser usado para controlar como as operações devem ser propagadas para entidades associadas. @victorsa-meli

*/




}
