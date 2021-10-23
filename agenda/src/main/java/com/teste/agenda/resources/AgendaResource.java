package com.teste.agenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;

import com.teste.agenda.repository.AgendaRepository;
import com.teste.agenda.molds.AgendaTelefone;

@RestController
@RequestMapping(value = "/api")
public class AgendaResource {

    @Autowired

    AgendaRepository agendaRepository;

    @GetMapping("/agenda")
    public List<AgendaTelefone> listaAgenda() {
        return agendaRepository.findAll();
    }

    @PostMapping("/agenda")
    public AgendaTelefone salvaContato(@RequestBody AgendaTelefone agenda) {
        return agendaRepository.save(agenda);
    }

    @DeleteMapping("/agenda")
    public void deletContato(@RequestBody AgendaTelefone agenda) {
        agendaRepository.delete(agenda);
    }


    @PutMapping("/agenda")
    public AgendaTelefone atualizaAgenda(@RequestBody AgendaTelefone agenda) {
        return agendaRepository.save(agenda);
    }


}
