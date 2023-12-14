package br.com.api.escola.escola.controller;


import br.com.api.escola.escola.model.aluno.Aluno;
import br.com.api.escola.escola.model.aluno.DadosCadastroAluno;
import br.com.api.escola.escola.model.sala.Sala;
import br.com.api.escola.escola.repository.AlunoReposository.AlunoRepository;
import br.com.api.escola.escola.repository.SalaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    AlunoRepository repository;

    @Autowired
    SalaRepository salaRepository;


    @PostMapping("/novo-aluno")
    @Transactional
public void novoAluno(@RequestBody @Valid DadosCadastroAluno dados){
repository.save(new Aluno(dados));

        /*
        DadosCadastroAluno aluno1 = new DadosCadastroAluno("jose miguel");
        DadosCadastroAluno aluno2 = new DadosCadastroAluno("maria miguel");
        DadosCadastroAluno aluno3 = new DadosCadastroAluno("tales miguel");
        DadosCadastroAluno aluno4 = new DadosCadastroAluno("camila miguel");

Sala ss = new Sala();

        // Assuming salaId is the ID of the Sala you want to link the Aluno to
       Long salaId = 2L; // Replace with the actual Sala ID
       ss = salaRepository.findById(salaId).orElseThrow();

        System.out.println(ss.getId());

       // aluno.setSala(sala);
       // repository.save(aluno);
        System.out.println(aluno1);
        Aluno al = new Aluno(aluno2);
        al.addSala(ss);
         repository.save(al);
*/
}






}
