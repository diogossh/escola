package br.com.api.escola.escola.controller;

import br.com.api.escola.escola.model.sala.DadosCadastroSala;
import br.com.api.escola.escola.repository.SalaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("sala")
public class SalaController {


    @Autowired
    SalaRepository repository;





}
