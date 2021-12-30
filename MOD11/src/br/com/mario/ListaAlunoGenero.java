package br.com.mario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import br.com.mario.Aluno;

public class ListaAlunoGenero {

	public static void main(String[] args) {
		listaAlunoGenero();
		
		

	}

	private static void listaAlunoGenero() {
		
		System.out.println("**********Listagem Alunos Com Genero********");
		
		List <Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno ("Mario", "Masculino", 43, "Matriculado");
		Aluno b = new Aluno ("Janaina", "Feminino", 27, "Matriculado");
		Aluno c = new Aluno ("Jasmine", "Feminino", 26, "Trancado");
		Aluno d = new Aluno ("Pedro", "Masculino", 18, "Concluido");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		
	
		
		System.out.println(lista);
		
		
		
	}

}
