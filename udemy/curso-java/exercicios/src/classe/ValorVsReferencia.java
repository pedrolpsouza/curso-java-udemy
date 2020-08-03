package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		System.out.printf("%.0f %.0f\n",a, b);
		a++;
		b--;
		System.out.printf("%.0f %.0f\n",a, b);
		Data d0 = new Data(1, 1, 1990);
		Data d00 = d0;
		d0.dia = 30;
		d00.mes = 12;
		d00.ano = 2020;
		System.out.println(d0.obterDataFormatada());
		System.out.println(d00.obterDataFormatada());
		retornaData(d0);
		System.out.println(d0.obterDataFormatada());
		System.out.println(d00.obterDataFormatada());
		
	}
	
	static void retornaData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}