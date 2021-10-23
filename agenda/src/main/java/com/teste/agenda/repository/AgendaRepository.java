package com.teste.agenda.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.agenda.molds.AgendaTelefone;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaTelefone, Long> {

    AgendaTelefone findById(long id);

}
