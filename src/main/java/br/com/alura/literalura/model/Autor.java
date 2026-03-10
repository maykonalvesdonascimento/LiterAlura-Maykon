package br.com.alura.literalura.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "autor")
    private String nome;

    @Column(name = "data_nascimento")
    private Integer dataDeNascimento;

    @Column(name = "data_morte")
    private Integer dataDaMorte;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Livro> livros = new ArrayList<>();

    public Autor(String nome, Integer dataDeNascimento, Integer dataDaMorte) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDaMorte = dataDaMorte;
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

    public Integer getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Integer dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getDataDaMorte() {
        return dataDaMorte;
    }

    public void setDataDaMorte(Integer dataDaMorte) {
        this.dataDaMorte = dataDaMorte;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

}
