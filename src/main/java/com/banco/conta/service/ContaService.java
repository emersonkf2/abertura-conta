package com.banco.conta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.conta.model.Conta;
import com.banco.conta.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository jpa;

	public Conta save(Conta conta) {
		return jpa.save(conta);
	}
	
}
