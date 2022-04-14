package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Estado;
import com.springboot.service.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoController {

	@Autowired
	private EstadoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Estado> find(@PathVariable Integer id) {
		Estado obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Estado>> list(){
		List<Estado> obj = service.list();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/page")
	public ResponseEntity<Page<Estado>> listPage(
			@RequestParam(value = "page", defaultValue = "0") Integer page, 
			@RequestParam(value = "linesPerPage", defaultValue="2") Integer linesPerPage, 
			@RequestParam(value = "orderBy", defaultValue="nome")String orderBy, 
			@RequestParam(value = "direction", defaultValue="ASC") String direction){
		Page<Estado> obj = service.listPage(page, linesPerPage, orderBy, direction);
		return ResponseEntity.ok().body(obj);
		
		//Valor 'direction' pode ser ASC ou DESC
	}
}
