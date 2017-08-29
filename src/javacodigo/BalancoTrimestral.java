package javacodigo;

public class BalancoTrimestral {
	
	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarço = 17000;
		
		
		int gastroTrimestral = gastoJaneiro + gastoFevereiro + gastoMarço;
		
		int mediaMensal = gastroTrimestral / 3;
		
		System.out.println(gastroTrimestral);
		
		System.out.println("Valor da média mensal = " +  mediaMensal);
		
		
	}
	
	
}









