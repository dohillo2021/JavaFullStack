package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notaslogica = {7.1,5.7,9.6,7.8};

		/*Cria��o do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("William dos Santos Machado");
		aluno.setNomeEscola("JDEV Treinamento");
		
		/*Cria��o da Disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
	
		/*Como relaciona? como amarra essa disciplina amarrada com o aluno?*/
		
		aluno.getDisciplinas().add(disciplina);
		
		/*Cria��o da Segunda Disciplina*/
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de programa��o");
		disciplina2.setNota(notaslogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//--------------------------------------------------------------
		
		/*Cria��o do aluno 2*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Enrico Fernandes Machado");
		aluno2.setNomeEscola("JDEV Treinamento");
		
		
		/*Cria��o da Disciplina 3 e 4*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java");
		disciplina3.setNota(notas);
		
	
		/*Como relaciona como amarra essa disciplina amarrada com o aluno*/
		
		aluno2.getDisciplinas().add(disciplina3);
		
		/*Cria��o da Segunda Disciplina*/
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("L�gica de programa��o");
		disciplina4.setNota(notaslogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		System.out.println("--------------------------------------------------------------");
		//------------------------------------------------
		
		Aluno [] arrayAlunos = new Aluno[2]; // Aqui temos um Array
		
		arrayAlunos[0] = aluno;/*alocando o aluno dentro do array e dentro desse aluno tem as disciplinas*/
		arrayAlunos[1] = aluno2;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			
			System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome());/*percorrendo lista alunosalunos*/
			System.out.println("--------------------------------------------------------------");
			
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {/*Percorrendo lista de Disciplinas*/
				System.out.println("Nome da disciplina �: " + d.getDisciplina());
				
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota n�mero :" + posnota + " � igual = " + d.getNota()[posnota]);
				}
			}
			
			
		}
		
		
		
	}
}
	
