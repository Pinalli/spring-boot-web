package br.com.pinalli.domain;

import com.sun.javafx.geom.transform.Identity;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "musicas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String titulo;

    @NotBlank
    @Size(min = 2, max = 50 )
    private Sting banda;

    @Range(min = 2 , max = 10)//Valor inteiro entre 0 e 10
    @Column(nullable = false)
    private int nota;

    @ManyToMany
    @JoinColumnI(name = "id_playList_fk")
    private PlayList playList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Sting getBanda() {
        return banda;
    }

    public void setBanda(Sting banda) {
        this.banda = banda;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
