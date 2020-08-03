package poo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.nomeCliente = "Pedro";
		c1.itens.add(new Item("Notebook", 3, 3500.00));
		c1.itens.add(new Item("Mouse", 1, 100.50));
		c1.itens.add(new Item("Placa de Vídeo", 2, 1550.35));
		c1.itens.add(new Item("Teclado", 1, 88.90));
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
	}
	
}
