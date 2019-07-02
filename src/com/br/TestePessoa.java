package com.br;


import java.util.ArrayList;
import java.util.List;
public class TestePessoa {
	public static void main(String[] args) {

				List<String> linguagensUsadas;
			linguagensUsadas.add(" pyton");
			linguagensUsadas.add("cobol");
			linguagensUsadas.add("html");

			
			List<String> filmes = new ArrayList<String>();
			filmes.add("John Wick");
			filmes.add("Matrix");
			filmes.add("Constantine");
			filmes.add("Advogado do Diabo");
			
			
			Ator  ator = new Ator("Keanu", "Reaves", 50,
					filmes, false, 1970);
			Programador programa = new Programador("Andressa", "Cintra", 16, linguagensUsadas,05, true);
    
			return System.out.println("O melhor filme de " + a.getNome() + " é " + a.getMelhorFilme());
		}
	}

