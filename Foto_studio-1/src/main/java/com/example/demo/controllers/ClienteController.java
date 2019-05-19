package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.Cliente;
import com.example.demo.models.services.IClienteService;

@RestController
@RequestMapping("/ast/api/v1/Cliente")
public class ClienteController {
private IClienteService clienteservice;

@RequestMapping("")
private List<Cliente> findAll(){
return clienteservice.findAll();
}
}