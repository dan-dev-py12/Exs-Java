package ex16ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("Daniel",9));
		alunos.add(new Aluno("Maria",8));
		alunos.add(new Aluno("Claudeci",6));
		alunos.add(new Aluno("Julia",6));
		alunos.add(new Aluno("Carlos",7));
		
		double somaNotas = 0;
		
		for(Aluno aluno : alunos) {
			aluno.exibirInformacoes();
			somaNotas += aluno.getNota();
			System.out.println("-=-=-=-=-=-=-=-=");
		}
		System.out.println("Alunos cadastrados: " + alunos.size());
		double mediaNotas = somaNotas / alunos.size();
		
		
		System.out.println("Media das notas: " + mediaNotas);

	}

}
