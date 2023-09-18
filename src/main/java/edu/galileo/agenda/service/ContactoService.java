package edu.galileo.agenda.service;

import edu.galileo.agenda.model.Contacto;
import edu.galileo.agenda.model.repository.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {
@Autowired
private ContactoRepositorio contactoRepositorio;
public Contacto add(Contacto contacto){
    return this.contactoRepositorio.save(contacto);
    }
public List<Contacto> list(){
    return this.contactoRepositorio.findAll();
}
}
