package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ClienteDao;
import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	public void salvar(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	public void buscarTodos() {
		clienteDao.findAll();
	}

}
