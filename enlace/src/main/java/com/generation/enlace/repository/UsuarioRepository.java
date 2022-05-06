package com.generation.enlace.repository;

import com.generation.enlace.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}
