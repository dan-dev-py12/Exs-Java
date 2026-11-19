package ex15ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("Daniel",18,9.8));
		alunos.add(new Aluno("Marcos",19,8.8));
		alunos.add(new Aluno("Cesar",18,9.0));
		alunos.add(new Aluno("Julia",18,9.7));
		alunos.add(new Aluno("Eduarda",18,9.5));
		
		
		
		for(Aluno aluno : alunos) {
			aluno.info();
			System.out.println("=-=-=-=-=-=-=-=");
		}
		
		
		
		

	}

}
