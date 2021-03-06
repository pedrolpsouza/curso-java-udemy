package poo.desafiocarro;

public class Carro {
	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	int acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
		return velocidadeAtual;

	}

	int frear() {

		if (velocidadeAtual >= getDelta()) {
			velocidadeAtual -= getDelta();

		} else {
			velocidadeAtual = 0;
		}
		return velocidadeAtual;

	}
}
