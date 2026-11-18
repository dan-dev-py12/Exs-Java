package ex10Array;

public class Main {

	public static void main(String[] args) {
		
		Aluno[] alunos = {new Aluno("Daniel",10),
						  new Aluno("Vitor",9),
						  new Aluno("Julia",8)
				
		};
		
		for(Aluno aluno : alunos) {
			aluno.info();
			System.out.println("=-=-=-=-=-=-=-=");
		}
		

	}

}
