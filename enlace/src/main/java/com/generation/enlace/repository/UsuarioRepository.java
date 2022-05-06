package com.generation.enlace.repository;

import com.generation.enlace.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
<<<<<<< HEAD
        public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}

=======
	
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}
>>>>>>> 7ef23d709f875a6003119d258b11cd8da1070ae4
