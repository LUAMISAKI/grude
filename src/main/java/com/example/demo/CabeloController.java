package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cabelo")
public class CabeloController {

		@Autowired
	    private CabeloService cabeloService;
	
		@GetMapping("/listar")
		public List<Cabelo> listar() {		
		return cabeloService.listar();
	
		}
		@GetMapping("/pegarId/{id}")
		public Optional<Cabelo> pegarId(@PathVariable Long id) {
			return cabeloService.pegarId(id);
			
		}
		@PostMapping("/adicionar")
		public Cabelo adicionar(@RequestBody Cabelo cabelo) {
			return cabeloService.adicionar(cabelo);
			
		}
		@DeleteMapping("/deletar/{id}")
		public void deletar(@PathVariable Long id) {
			 cabeloService.deletar(id);
			
		}
		@PutMapping("/atualizar/{id}")
		public Cabelo atualizar(@PathVariable Long id,@RequestBody Cabelo cabelo) {
			return cabeloService.atualizar(id, cabelo);
		}
}
