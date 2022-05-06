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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.enlace.model.PostagemModel;
import com.generation.enlace.repository.PostagemRepository;

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
	
	@GetMapping("/{postagemId}")
	public ResponseEntity<PostagemModel> GetById (@PathVariable long postagemId){
		return repository.findById(postagemId)
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
	
<<<<<<< HEAD
	@DeleteMapping("/{postagemId}")
	public void delete(@PathVariable long postagemId) {
		repository.deleteById(postagemId);
=======
	@PutMapping
	public ResponseEntity<PostagemModel> put(@Valid @RequestBody PostagemModel conteudo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(conteudo));
				
	}
	
	@DeleteMapping("/{postagem_id}")
	public void delete(@PathVariable long postagem_id) {
		repository.deleteById(postagem_id);
>>>>>>> 21f42db6c89ff36c73d9b4c5527c96cdb9aca085
	}
	
}
