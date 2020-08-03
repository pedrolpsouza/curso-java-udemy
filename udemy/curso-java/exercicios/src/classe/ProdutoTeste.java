package classe;

//import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		//Produto p2 = new Produto("DELL", 5000);
		//var p2 = new Produto();
		p1.nome = "Notebook ACER";
		p1.preco = 2500.00;
		Produto.desconto = 0.25;
		/*
		p2.nome = "SmartPhone";
		p2.preco = 3650.25;
		p2.desconto = 0.10;
		double valorDesconto = p1.preco * p1.desconto/100;
		System.out.printf("Desconto %.2f \n " , valorDesconto );
		double precoFinal = ((p1.preco - (p1.preco* p1.desconto / 100))); // forma 1
		System.out.println(p1.nome+", Valor Final = "  + precoFinal);
		p1.desconto = .25;
		double precoFinal2 = p1.preco * (1- p1.desconto);// forma 2
		System.out.println(p1.nome + "\n" + " Valor Final = "  + precoFinal2);
		
		double resultado = p1.precoComDesconto();
		double acrescimo = p1.precoComAcrescimo();
		System.out.println(p1.precoComDesconto());
		System.out.print(p1.nome);
		System.out.printf(", Valor Com Desconto = %.2f\n", resultado);
		System.out.printf("Valor do produto com acrescimo %.2f\n ",acrescimo);
		//Produto p3 = new Produto();
		//-----------------------------------------------------------------------
		// Exemplo de metodo para soma!!!!!!!!!!!!!
		/*
		Scanner entrada = new Scanner(System.in);
		int a,b;
		System.out.print("Digite um numero : ");
		a = entrada.nextInt();
		System.out.print("Digite o 2 numero : ");
		b = entrada.nextInt();
		int x = p3.soma(a,b);
		System.out.println("Resultado da soma " + x);
		*/
		//System.out.printf("%s %.2f %.2f ",p2.nome, p2.preco, p2.desconto);
		//entrada.close();
		
	}
}
