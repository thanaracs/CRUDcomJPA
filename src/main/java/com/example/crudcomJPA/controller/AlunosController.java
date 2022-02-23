package com.example.crudcomJPA.controller;

import com.example.crudcomJPA.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Transactional
@Controller
@RequestMapping("alunos")
public class AlunosController {
    @Autowired
    AlunoRepository repository;


}
