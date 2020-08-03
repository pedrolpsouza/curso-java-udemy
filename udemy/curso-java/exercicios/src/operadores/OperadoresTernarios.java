package operadores;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double media = 7;
		String recuperacaoReprovado = media >=5 ?"Recuperação " : "Reprovado";
		String resultado = media >=7 ?"aprovado" : recuperacaoReprovado;
		System.out.println(resultado);
		
			
		}
		
	}
