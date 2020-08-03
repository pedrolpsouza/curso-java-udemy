package poo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta", 9.55, 100);
		compra1.adicionarItem(new Produto("Notebook", 1985.55), 5);
		Cliente c1 = new Cliente("Pedro");
		c1.compras.add(compra1);
		System.out.println(c1.valorTotal());
	}
}
	