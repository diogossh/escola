package br.com.api.escola.escola.model.aluno;


import br.com.api.escola.escola.model.sala.Sala;
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
public class Aluno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;





    @ManyToMany(mappedBy = "alunos")
    private List<Sala> salas;





    public Aluno(DadosCadastroAluno dados){
    this.nome = dados.nome();


    }




}
