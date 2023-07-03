package com.example.Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.entity.Pessoa;
import com.example.Crud.repository.PessoaRepository;
import com.example.Crud.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @PostMapping("/")
    public Pessoa inserir(@RequestBody Pessoa objeto){
        return pessoaService.inserir(objeto);
    }
    
}
