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
=======

        public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}
>>>>>>> 9d0b8c86ef300b8cbd81309e729053241c9b77b1
>>>>>>> 19765db17e16f4e220dd720f1362ff311ee52737
