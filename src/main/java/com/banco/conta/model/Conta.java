package com.banco.conta.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TB_CONTA")//, uniqueConstraints={@UniqueConstraint(columnNames={"cpf","email"})})
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	private Long id;
	
	@Getter @Setter
	@NotBlank(message = "{nome.not.blank}")
	private String nome;
	
	@Getter @Setter
	@NotBlank(message = "{email.not.blank}")
	@Email(message = "{email.not.valid}")
	@Column(unique = true)
	private String email;
	
	@Getter @Setter
	@NotBlank(message = "{cpf.not.blank}")
	@Column(unique = true)
	private String cpf;
	
	@Getter @Setter 
	@NotBlank(message = "{datanascimento.not.blank}")
	private String dataNascimento;
}
