package javacodigo;

public class Turma {

	Aluno[] alunos;    // array de notas do tipo int por padrao ele e null
	void imprimeNotas(){
		
		int j = 0;
		while (j < this.alunos.length) {
			Aluno aluno = this.alunos[j];
			if(aluno == null) continue;
			System.out.println(aluno.nome);
			System.out.println(aluno.notas);
			j++;
		}

		for (int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue;
			
			System.out.println(aluno.nome);
			System.out.println(aluno.notas);
		}

	}
	
}
