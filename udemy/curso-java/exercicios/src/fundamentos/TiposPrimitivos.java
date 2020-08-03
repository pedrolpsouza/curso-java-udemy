package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// dados de funcionario
		
		
		//tipos numericos inteiros
		// capacidade maxima de armazemanento
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 32767;
		//int id = 5467;
		// para variaveis long tem que usar o L no final pra reconhecer que é long
		long pontosAcumulados = 2_134_845_223L;
		
		// tipos numericos ponto flutuante
		//float salario = 11_445.44F;
		double vendasAcumuladas = 2_2991_232.30;
		//boolean
		boolean estaDeFerias  = true;
		char status = 'I'; // ativo
		//String nome = "Pedro";
		//dias de empresa
		System.out.println(anosDeEmpresa *365);
		// numero de viagens
		System.out.println(numeroDeVoos /2);
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		if(estaDeFerias == false) {
			System.out.println("esta de ferias o folgado");	
		}
		else {
		System.out.println("não está de ferias o trabalhor");
		}
		if(status != 'A') {
			System.out.println(" inativo");
		}else {
			System.out.println("Ativo");
		}
	}
	
}
