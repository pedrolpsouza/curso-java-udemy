package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(07,12,1990);
		/*
		
		d1.dia = 07;
		d1.mes = 12;
		d1.ano = 1990;
		*/
		//String a = d1.obterDataFormatada();
		
		System.out.printf("%d/%d/%d\n",d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d",d2.dia, d2.mes, d2.ano);
	}
}
