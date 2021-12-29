package br.com.mario;

import java.util.Objects;


public class  Aluno{
	
	private String nome;
	private String genero;
	private int idade;
	private String status;
	
	public Aluno (String nome, String genero, int string, String status) {
		this.nome=nome;
		this.genero=genero;
		this.idade=string;
		this.status=status;
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}




	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", status=" + status + "]";
	}
	

}
