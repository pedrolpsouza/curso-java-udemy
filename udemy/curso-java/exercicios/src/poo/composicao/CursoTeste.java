package poo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("João");
		Curso c1 = new Curso("Matemática");
		Curso c2 = new Curso("Java");
		Curso c3 = new Curso("C#");
		c1.adicionarAluno(a1); // adicionando aluno no curso
		c1.adicionarAluno(a2);
		c1.adicionarAluno(a3);
		c2.adicionarAluno(a1);
		a1.adicionarCurso(c3); // adicionando curso para o aluno
		
		for(Aluno aluno: c2.alunos) {
			System.out.print(aluno.nome +  " Está matriculado no curso de ");
			System.out.println(" " + c2.nome);
		}
		/*
		System.out.println();
		for (Curso curso: a1.cursos) {
			System.out.println(curso.nome);
		}
		*/
		System.out.println(a1.cursos.get(0).alunos + "" + c1.alunos.get(0).cursos);
		
	}
}
