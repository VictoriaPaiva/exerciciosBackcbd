package br.org.generation.desafioCurso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ra")
 private int ra;
	@Column(name="nome", length = 100)
 private String nome;
	@Column(name="email", length = 100)
 private String email;
	@Column(name="telefone", length = 20)
 private String telefone;
	@Column(name="dataNasc", length = 20)
	private String dataNasc;
	
	@ManyToOne
	@JsonIgnoreProperties("alunos")
	private Curso curso;
	
 
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
 
 
}