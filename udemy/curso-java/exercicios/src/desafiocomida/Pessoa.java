package desafiocomida;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	double comer(Comida pesoComida) {
		if (pesoComida!=null) {
			this.peso += pesoComida.pesoComida;
		}
		
		return this.peso;
	}
}
