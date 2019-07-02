package com.br;

import java.util.List;

public class Programador extends Pessoa{

	private List<String> linguagensUsadas;
	private int anosExperiencia;
	private boolean gostaDeCafe;

	public Programador(String nome, String sobrenome, int idade, List<String> linguagensUsadas, int anosExperiencia,
			boolean gostaDeCafe) {
		super(nome, sobrenome, idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperiencia;
		this.gostaDeCafe = gostaDeCafe;
	}

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Ano de experiencia ->" + this.anosExperiencia);
		modelo.append("Linguagem usada atual ->" + this.linguagensUsadas);


		return super.toString();

	}
}