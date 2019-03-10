package dev.livia.crudrestspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.livia.crudrestspring.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
