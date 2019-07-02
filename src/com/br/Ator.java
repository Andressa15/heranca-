package com.br;

import java.util.List;
import java.util.Random;

public class Ator extends Pessoa{

	private List<String> filmesParticipados;
	private boolean temOscar;
	private  int anoNascimento;
	private  String melhorFilme;

	
	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipados, boolean temOscar,
			int anoNascimento) {
		super(nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
	}

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		int index = 0;
		Random r = new Random();
		index = Math.abs(r.nextInt()) % filmesParticipados.size();
		melhorFilme = filmesParticipados.get(index);
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Melhor filme ->" + this.melhorFilme);
		modelo.append("Ano nascimento->" + this.anoNascimento);
		
		return super.toString();

	}
	
	public static void main(String[] args) {
		//vamos la
		//seguinte. O new Random().nextLong(), vai sortear um numero no intervalos do long
		//como vc mesmo comentou, pode vir um numero 3455623, mas nao é isso que queremos
		//queremos de alguma forma controlar o tamanho do aleatorio e para isso temos q usar matematica
		
		Random r = new Random(); 
		long i = Math.abs(r.nextLong());
		System.out.println(i);//numero sorteado
		System.out.println(i % 4);// numero calculado para o que queremos
		//Conclusao: Quando pegamos o resto de 2, os valores possiveis sao -1, 0 e 1
		//vamos fazer com 4. os valores de resposta sao -3,-2,-1, 0, 1, 2, 3
		//Conclusao final: Se queremos numeros entre 0 a 10, nos devemos pegar o numero aleatorio e pegar o resto
		//por 11 se quisermos numeros entre o e 45, temos que pegar o resto por 46
		//Detalhe: Vimos q tem chance de devolver negativo, podemos pegar o numero aleatorio e transformar em 
		//positivo usando Math.abs(), esse metodo pega o valor absoluto de um numero, no caso sempre retorna postivo
		
		//usamos o % para calcular  resto
		
		//Agora é só implementar no seu metodo
	}
}
//	 Crie um atributo chamado melhorFilme para a 
//	 classe Ator e utilize o método Random para gerar um número aleatório e buscar no ArrayList 
//	 o filme que estiver naquele determinado índice e atribuir ao atributo melhorFilme
//