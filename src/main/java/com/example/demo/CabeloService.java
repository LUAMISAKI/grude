package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabeloService {

	@Autowired
	 private CabeloRepository cabeloRepository;
	
		public List<Cabelo> listar() {		
		return cabeloRepository.findAll() ;	
	
		}
		public Optional<Cabelo> pegarId(Long id) {
			return cabeloRepository.findById(id);
			
		}
		
		public Cabelo adicionar(Cabelo cabelo) {
			cabeloRepository.save(cabelo);
			return cabelo;
		}
		
		public void deletar(Long id) {
			cabeloRepository.deleteById(id);
			
		}
		
		public Cabelo atualizar(Long id,Cabelo cabelo) {
			 Cabelo hair = cabeloRepository.getById(id);
			 hair=cabelo;
			 hair.setId(id);
			 cabeloRepository.save(hair);
			 return hair;
		}
		
}
