package com.br;

public abstract class Pessoa {

	public String nome;
	public String sobrenome;
	public int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Nome ->" + getNome());
		modelo.append("Sobrenome ->" + getSobrenome());
		modelo.append("Idade ->" + getIdade());

		return super.toString();
	}

}
