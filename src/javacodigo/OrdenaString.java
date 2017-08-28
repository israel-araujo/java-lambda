package javacodigo;

// default method

// A grande vantagem é que agora uma interface pode evoluir sem quebrar compatibilidade.

// Because, as eclipse aptly comments, java.awt.List is not parameterized ;)

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OrdenaString {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		palavras.add("Spark is the framework used from processing in real time or in memory");
		
		Comparator<String> comparador = new ComparadorPorTamanho();    // Para utilizar o criterio de ordenação cria um novo objeto

	//	 Collections.sort(palavras,comparador);  // deve ser passado o argumento .
	//	palavras.sort(comparador);  // metodo sort  nunca existiu  
	//	System.out.println(palavras);
		
	//	for (String p : palavras) {    // aqui tem uma iteração usando o foreach // mas no java 8 tem outra forma de fazer essa iteração
	//		System.out.println(p);
			
	//	}
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);    //a interface que o novo método forEach recebe como parâmetro  Consumer, que possui um único método abstrato chamado accept

	}

}


class ImprimeNaLinha implements Consumer<String>{

@Override
public void accept(String s) {
	System.out.println(s);
	
	}
}




class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s2.length() < s1.length())
			return -1;							// RETORNA NUMERO NEGATIVO CASO S1 FOR MENOR QUE O TAMANHO LENGTH QUE S2F
		if (s2.length() > s1.length())
			return 1;
		return 0;     // EM CASA DE DER EMPATE
	}

}


