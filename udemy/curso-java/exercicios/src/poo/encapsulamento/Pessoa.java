package poo.encapsulamento;

public class Pessoa {
	private int idade;
	String nome;
	String sobrenome;
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 90) {
			this.idade = idade;
		}

	}

	Pessoa(String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}

	public int fazerAniversario(int soma) {
		return this.idade += soma;

	}

	@Override
	public String toString() {

		return "Olá, meu nome é " + this.getNome() + " e tenho " + this.getIdade() + " Anos ";
	}

}
