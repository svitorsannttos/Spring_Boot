package com.springboot.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.springboot.domain.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idUsuario;
	
	private String nome;
	
	private Date dataNascimento;

	public UsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.nome = usuario.getNome();
		this.dataNascimento = usuario.getDataNascimento();
	}

	public static List<UsuarioDTO> convertListUsuarioDTO(List<Usuario> usuario) {
		return usuario.stream().map(UsuarioDTO::new).collect(Collectors.toList());
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
