package javacodigo;



public class TesteModificador {
	public static void main(String[] args) {

		Conta joao = new Conta();
		// joao.numero = 123;
		joao.deposita(500.0);
		joao.setLimite(100);
		double valorASerSacado = 200;

		joao.saca(valorASerSacado);
		
		
		Conta jose = new Conta();
		
		
		

		System.out.println(joao.getNumero());
		System.out.println(jose.getNumero());


	}

}
