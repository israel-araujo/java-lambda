package javacodigo;



public class TesteModificador {
	public static void main(String[] args) {

		Conta joao = new Conta(123, 100.0);
		// joao.numero = 123;
		joao.deposita(500.0);
		joao.setLimite(100);
		double valorASerSacado = 200;

		joao.saca(valorASerSacado);

		System.out.println(joao.getSaldo());

	}

}
