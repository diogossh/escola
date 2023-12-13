package br.com.api.escola.escola.repository;

import br.com.api.escola.escola.model.sala.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<Sala, Long> {
}
