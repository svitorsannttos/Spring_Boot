package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
