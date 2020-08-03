package poo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		System.out.println(c.estaLigado());
		System.out.println(c.c1.giros());
		c.ligar();
		System.out.println(c.estaLigado());
		System.out.println(c.c1.giros());
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c.c1.giros());
		c.frear();
		System.out.println(c.c1.giros());
	}
}
