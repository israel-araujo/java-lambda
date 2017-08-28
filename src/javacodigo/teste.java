package javacodigo;

/**
 * shadowing acesso a variavel local
 * 
 * @author Israel
 *
 */
public class teste {

	static String nome;
	static String nomeCompleto = nome + "araujo";
	static int idade;
	double salario;

	public static void main(String[] args) {
		teste t = new teste();
		 t.m1();
		// t.m2();
		// t.salario = 39.00;
		// t.nome = "israel araujo";
		// t.idade = 34;

		// System.out.println(t.nome +" " + t.salario + " " + t.idade);
	//	System.out.println("                                       ");
		//System.out.println(teste.nome + "  " + teste.idade);

	}

	private void m2() {

	}

	private void m1() {
		int x = 10;

		if (x >= 10) {
			int y = 50;
		//	System.out.println(y);

		}

		System.out.println(x);

	}

}
