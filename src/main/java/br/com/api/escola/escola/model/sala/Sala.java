package br.com.api.escola.escola.model.sala;


import br.com.api.escola.escola.model.aluno.Aluno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_sala;

    @ManyToMany
    @JoinTable(
            name = "sala_aluno",
            joinColumns = @JoinColumn(name = "sala_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos;


    public Sala(DadosCadastroSala dados){
        this.id = dados.id();
        this.nome_sala = dados.nome_sala();

    }








}
