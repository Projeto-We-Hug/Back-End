package com.generation.wehug.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.wehug.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByTopicoPrincipalContainingIgnoreCase(String topicoPrincipal);
	
	 public Optional<Tema> findByDescricao(String descricao);

}