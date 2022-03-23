package com.springboot.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(schema = "estrutura", name = "tb_municipio")
public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMunicipio;

	private String nome;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	public Municipio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Municipio(Integer idMunicipio, String nome, Estado estado) {
		super();
		this.idMunicipio = idMunicipio;
		this.nome = nome;
		this.estado = estado;
	}

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
