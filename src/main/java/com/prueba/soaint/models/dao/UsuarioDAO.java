package com.prueba.soaint.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.soaint.models.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

	public Usuario findByUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);
}
