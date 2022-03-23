package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.domain.Estado;
import com.springboot.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public Estado find (Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow();
	}
	
	public List<Estado> list(){
		return repo.findAll();
	}
	
	
}
