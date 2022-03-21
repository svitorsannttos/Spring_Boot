package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.domain.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

}
