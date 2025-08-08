package com.miguel.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miguel.tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
