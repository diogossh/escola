package br.com.api.escola.escola.repository.AlunoReposository;

import br.com.api.escola.escola.model.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
