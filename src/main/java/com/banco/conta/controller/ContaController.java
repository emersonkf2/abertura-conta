package com.banco.conta.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.conta.model.Conta;
import com.banco.conta.service.ContaService;

@RestController
@RequestMapping(value = "/banco")
public class ContaController {

	@Autowired
	private ContaService service;

	@PostMapping("/salvar-conta")
	public Conta salvaConta(@RequestBody @Valid Conta conta) {
		return service.save(conta);
	}
}