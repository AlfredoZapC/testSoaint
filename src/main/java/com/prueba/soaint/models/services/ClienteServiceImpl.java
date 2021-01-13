package com.prueba.soaint.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.soaint.models.dao.ClienteDAO;
import com.prueba.soaint.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDAO clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}
	

}
