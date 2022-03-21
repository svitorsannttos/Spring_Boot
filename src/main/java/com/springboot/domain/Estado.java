package com.springboot.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_estado", schema = "estrutura")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstado;
	
	private String nome;
	
	private String uf;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estado")
	private List<Municipio> municipios = new ArrayList<>();

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado(Integer idEstado, String nome, String uf, List<Municipio> municipios) {
		super();
		this.idEstado = idEstado;
		this.nome = nome;
		this.uf = uf;
		this.municipios = municipios;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEstado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(idEstado, other.idEstado);
	}
	
	
}
