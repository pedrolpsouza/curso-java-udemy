package poo.desafiocarro;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	Ferrari() {
		super(350);
		setDelta(15);
	}

	int acelerar() {
		return velocidadeAtual += getDelta();
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;

	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;

	}

	@Override
	public void ligarAR() {
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
		ligarAr = false;

	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}

}
