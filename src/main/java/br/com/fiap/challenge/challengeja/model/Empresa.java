package br.com.fiap.challenge.challengeja.model;

import javax.persistence.*;

@Entity
@Table(name = "empresas") // Especifica o nome da tabela no banco de dados
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Especifica o nome da coluna no banco de dados
    private Long id;

    @Column(name = "nome") // Especifica o nome da coluna no banco de dados
    private String nome;

    @Column(name = "descricao") // Especifica o nome da coluna no banco de dados
    private String descricao;

    public Empresa(Long novoId, String nome, String descricao) {
        this.id = novoId;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Empresa() {
        // Construtor vazio necessário para o JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
