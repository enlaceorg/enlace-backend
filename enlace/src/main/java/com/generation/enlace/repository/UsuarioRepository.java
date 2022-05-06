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
<<<<<<< HEAD
        public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}

	

=======
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}

>>>>>>> 572406c19eab195cc5e17c5a3eedfb98ab1f1f3a
>>>>>>> 6eb761d82af57e828488ac5d4cfafade2446fded
