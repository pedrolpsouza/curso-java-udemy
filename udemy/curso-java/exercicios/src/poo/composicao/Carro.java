package poo.composicao;

public class Carro {
	Motor c1 = new Motor();

	void acelerar() {
		c1.fatorInjecao += .4;
	}

	void frear() {
		c1.fatorInjecao -= .4;
	}

	void ligar() {
		c1.ligado = true;
	}

	void desligar() {
		c1.ligado = false;
	}

	boolean estaLigado() {
		return c1.ligado;
	}
}
