package com.generation.projetoblogpessoal.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id //Primary key(id)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Título é obrigatório e não pode utilizar espaços em branco")
	@Size(min = 5, max = 100, message = "O atributo deve ter entre 5 e 100 caracteres")
	private String titulo;
	
	@NotNull(message = "O atributo Texto é obrigatório e não pode utilizar espaços em branco")
	@Size(min = 10, max = 1000, message = "O atributo deve ter entre 10 e 1000 caracteres")
	private String texto;
	
	
	@UpdateTimesTemp
	private LocalDateTime data; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
