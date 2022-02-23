package com.example.crudcomJPA.repository;

import com.example.crudcomJPA.model.Aluno;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AlunoRepository {

        @PersistenceContext
        private EntityManager em;

        public void save(Aluno aluno){
            em.persist(aluno);
        }

        public Aluno aluno(Long id){
            return em.find(Aluno.class, id);
        }

        public List<Aluno> alunos(){
            Query query = em.createQuery("from Aluno");
            return query.getResultList();
        }

        public void remove(Long id){
            Aluno a = em.find(Aluno.class, id);
            em.remove(a);
        }

        public void update(Aluno aluno){
            em.merge(aluno);
        }
}

