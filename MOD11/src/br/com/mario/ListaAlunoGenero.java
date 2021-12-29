package br.com.mario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlunoGenero {

	public static void main(String[] args) {
		listaAlunoGenero();
		

	}

	private static void listaAlunoGenero() {
		
		System.out.println("**********Listagem Alunos Com Genero********");
		
		List <Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno ("Mario", "Masculino", "43", "Matriculado");
		
		lista.add(a);
		
	
		
		System.out.println(lista);
		
		
		
	}

}
