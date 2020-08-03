package poo.composicao;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso c) {
		this.cursos.add(c);
		c.alunos.add(this);
	}
	public String toString() {
		return nome;
	}
}
