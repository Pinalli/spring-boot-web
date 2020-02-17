package br.com.pinalli.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "playLists")
public class PlayList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max= 60)
    @Column(nullable = false, length = 60)
    private String nome;

    @ NotBlank
    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "playList", cascade = CascadeType.ALL)
    private List<Musica>musicas;


    private Long getId(){
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

    public List<Musica> getMusicas() {
        return musicas;
    }




}
