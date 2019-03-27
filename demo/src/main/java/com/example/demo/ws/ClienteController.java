package com.example.demo.ws;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;

@RestController
public class ClienteController {

	private ClienteService clienteService;
	
	@RequestMapping(method=RequestMethod.GET, value="/clientes")
	public void buscarTodos() {
		clienteService.buscarTodos();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/clientes", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
		clienteService.salvar(cliente);
	}
		
}
