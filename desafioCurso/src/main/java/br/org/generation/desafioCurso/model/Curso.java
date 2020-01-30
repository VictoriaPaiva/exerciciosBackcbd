package br.org.generation.desafioCurso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name= "nome", length = 100)
	private String nome;
	@Column (name="caragaHoraria")
	private int cargaHoraria;
	@Column (name="dataI", length = 20)
	private String dataI;
	@Column (name="dataF", length = 20)
	private String dataF;
	@Column(name="detalhes", length = 500)
	private String detalhes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List<Aluno> alunos;
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDataI() {
		return dataI;
	}
	public void setDataI(String dataI) {
		this.dataI = dataI;
	}
	public String getDataF() {
		return dataF;
	}
	public void setDataF(String dataF) {
		this.dataF = dataF;
	}
	
	
}