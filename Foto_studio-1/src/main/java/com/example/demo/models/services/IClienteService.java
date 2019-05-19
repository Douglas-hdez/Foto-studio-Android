package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entities.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findOne (Long id);
	
	public void delete(Long id);
}
