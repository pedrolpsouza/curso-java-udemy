package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double cel = 28;
		double fare = 100;
		double resultadoCel = (cel * 1.8) + 32;
		double resultadoFare = (fare - 32) /1.8;
		System.out.println(" Celcius = " + resultadoCel);
		System.out.println(" Fareheint =  " + resultadoFare);
		
		// usando como constantes
		// (º F	 - 32) * 5/9 = º C
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		double fare1 = 100;
		double resultadoCel1 = (fare1 - ajuste)  * fator;
		fare1 = 100;
		resultadoCel1 = (fare1 - ajuste)  * fator;
		System.out.println(resultadoCel1);
		
	}
}
 