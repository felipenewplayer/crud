package com.example.Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Pessoa;
import com.example.Crud.repository.PessoaRepository;

@Service
public class PessoaService {
        @Autowired
        private PessoaRepository pessoaRepository;
        
        public  List<Pessoa>buscarTodos(){
            return pessoaRepository.findAll();
        }

        public Pessoa inserir(Pessoa objeto){
            return pessoaRepository.saveAndFlush(objeto);
        }
}
