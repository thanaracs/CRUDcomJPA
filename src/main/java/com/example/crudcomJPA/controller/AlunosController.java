package com.example.crudcomJPA.controller;

import com.example.crudcomJPA.dao.AlunoRepository;
import com.example.crudcomJPA.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Transactional
@Controller
@RequestMapping("alunos")
public class AlunosController {

    @Autowired
    AlunoRepository repository;


    @GetMapping("/form")
    public String form(Aluno aluno) {
        return "/alunos/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("alunos", repository.alunos());
        return new ModelAndView("/alunos/list", model);
    }

    @PostMapping("/save")
    public ModelAndView save(Aluno aluno){
        repository.save(aluno);
        return new ModelAndView("redirect:/alunos/list");
    }

    @GetMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") int id){
        repository.remove(id);
        return new ModelAndView("redirect:/alunos/list");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("aluno", repository.aluno(id));
        return new ModelAndView("/alunos/form", model);
    }

    @PostMapping("/update")
    public ModelAndView update(Aluno aluno) {
        repository.update(aluno);
        return new ModelAndView("redirect:/alunos/list");
    }


}
