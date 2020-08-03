package poo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Souza", 29);
		p1.setIdade(-10);
		System.out.println(p1.getIdade());
		p1.setIdade(30);
		System.out.println(p1.getIdade());
		p1.setIdade(91);
		//System.out.print(p1.getNome() + " ");
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		//System.out.println(p1.getIdade());
		//System.out.println(p1.fazerAniversario(1));
		//System.out.println(p1.getIdade());
		//System.out.println(p1.fazerAniversario(2));
		//System.out.println(p1.fazerAniversario(1));
		
	}
}
