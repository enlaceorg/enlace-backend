package com.generation.enlace.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.enlace.model.PostagemModel;

@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<PostagemModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{postagem_id}")
	public ResponseEntity<PostagemModel> GetById (@PathVariable long postagem_id){
		return repository.findById(postagem_id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/conteudo/{conteudo}")
	public ResponseEntity<List<PostagemModel>> GetByTitulo(@PathVariable String conteudo){
		return ResponseEntity.ok(repository.findAllByConteudoContainingIgnoreCase(conteudo));
		}

	@PostMapping
	public ResponseEntity<PostagemModel> post(@Valid @RequestBody PostagemModel conteudo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(conteudo));		
	}
	
	@DeleteMapping("/{postagem_id}")
	public void delete(@PathVariable long postagem_id) {
		repository.deleteById(postagem_id);
	}
	
}
