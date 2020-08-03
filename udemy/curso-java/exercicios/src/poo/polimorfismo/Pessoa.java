package poo.polimorfismo;

public class Pessoa {
	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	/*
	public void comer(Arroz arroz, Feijao feijao, Sorvete sorvete) {
		this.peso += arroz.getPeso();
		this.peso += feijao.getPeso();
		this.peso += sorvete.getPeso();
	}
	/*
	public double comer(Feijao feijao) {
		return this.peso += feijao.getPeso();
	}
	public double comer(Sorvete sobremesa) {
		return this.peso += sobremesa.getPeso();
	}
	*/
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}

	}
	

}
