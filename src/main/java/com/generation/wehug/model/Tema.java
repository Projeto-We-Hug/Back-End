package com.generation.wehug.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O campo não pode ficar em branco")
	@Size(min = 1, max = 50, message = "O tópico deverá ter no mínimo 10 caracteres")
	private String topicoPrincipal;

	@NotBlank(message = "O campo não pode ficar em branco")
	@Size(min = 1, max = 50, message = "O sub tópico deverá ter no mínimo 10 caracteres")
	private String subTopicos;

	@NotBlank(message = "O campo não pode ficar em branco")
	@Size(min = 1, max = 1000, message = "A descrição deverá ter no mínimo 50 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTopicoPrincipal() {
		return topicoPrincipal;
	}

	public void setTopicoPrincipal(String topicoPrincipal) {
		this.topicoPrincipal = topicoPrincipal;
	}

	public String getSubTopicos() {
		return subTopicos;
	}

	public void setSubTopicos(String subTopicos) {
		this.subTopicos = subTopicos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
		
}
