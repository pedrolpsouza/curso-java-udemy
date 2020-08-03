package poo.desafiocarro;

public interface Luxo {
	void ligarAR();
	void desligarAr();
	default int nivelDoAr() {
		return 1;
	}
}
