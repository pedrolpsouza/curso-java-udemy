package poo.desafiocarro;

public class Teste {
	public static void main(String[] args) {
		/*
		Carro f1 = new Fusca();
		System.out.println("Teste Fusca");
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		f1.acelerar();
		System.out.println(f1.velocidadeAtual);
		f1.frear();
		System.out.println(f1.velocidadeAtual);
		f1.frear();
		System.out.println(f1.velocidadeAtual);
		f1.frear();
		System.out.println(f1.velocidadeAtual);
		*/
		System.out.println("Teste Ferrari");
		Ferrari f = new Ferrari();
		f.acelerar();
		f.ligarTurbo();
		System.out.println(f.velocidadeAtual);
		f.acelerar();
		f.ligarAR();
		System.out.println(f.velocidadeAtual);
		f.frear();
		System.out.println(f.velocidadeAtual);
		/*
		Carro c1 = new Civic();
		System.out.println("Teste Civic");
		System.out.println(c1.velocidadeAtual);
		c1.acelerar();
		System.out.println(c1.velocidadeAtual);
		*/
	
		

	}
}
