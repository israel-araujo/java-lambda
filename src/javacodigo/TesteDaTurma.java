package javacodigo;

/**
 * array de int array é um objeto precisa ser criado !
 * 
 * @author Israel
 *
 */

public class TesteDaTurma {

	public static void main(String[] args) {

		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		

		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "mauricio";
		fj11.alunos[0].notas = 5;
		
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "israel";
		fj11.alunos[1].notas = 8;
		

	  fj11.imprimeNotas();
	}
}
