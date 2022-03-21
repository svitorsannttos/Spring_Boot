package com.springboot.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Usuario;
import com.springboot.dto.UsuarioDTO;
import com.springboot.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> listUsuarioDTO(){
		List<Usuario> list = service.list();
		List<UsuarioDTO> listDTO = list.stream().map(UsuarioDTO::new).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
