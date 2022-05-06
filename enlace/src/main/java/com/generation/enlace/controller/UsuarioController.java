package com.generation.enlace.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.enlace.model.UsuarioModel;
import com.generation.enlace.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{usuarioId}")
	public ResponseEntity<UsuarioModel> getById(@PathVariable Long usuarioId){
		return repository.findById(usuarioId).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

<<<<<<< HEAD
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<UsuarioModel>>getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}

=======
>>>>>>> af153e7ff4837404fead05bce4a309fec682d8ff
	@PostMapping
	public ResponseEntity<UsuarioModel> post (@RequestBody UsuarioModel usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}
	
	@PutMapping
	public ResponseEntity<UsuarioModel> put (@RequestBody UsuarioModel usuario){
		return repository.findById(usuario.getUsuarioId())
				.map(resp -> ResponseEntity.status(HttpStatus.OK)
						.body(repository.save(usuario))).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{usuarioId}")
	public void delete(@PathVariable Long usuarioId) {
		repository.deleteById(usuarioId);
	}
}