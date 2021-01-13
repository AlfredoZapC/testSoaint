package com.prueba.soaint.models.services;

import java.util.List;

import com.prueba.soaint.models.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);

}
