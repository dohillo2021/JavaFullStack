package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	/* Main é um método auto executavel em java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		try {
			lerArquivo();
			
		/*Tratamento de erro abaixo utilizando FileNotFoundException
		try {
			File fil = new File("c://lines.txt");	
			Scanner scanner = new Scanner(fil);
		}catch (FileNotFoundException e) {
			throw new ExecaoProcessarNota(e.getMessage());
		}
		*/
			
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		
		
		
		/*iniciando uma nova funcao de autenticacao abaixo if (new FuncaoAutenticacao*/
		/*Recebendo um objeto secretario (new Secretario(login, senha)*/
		/*E invocando o autenticar .autenticar()*/
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {/*Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legítimo*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();/*criando lista de alunos*/
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for (int qtd = 1; qtd <=1; qtd++) {
			
			/*New Aluno() é uma instancia (Criacao de Objeto)*/
			/*aluno1 é uma referencia para o objeto Aluno*/
			
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");/*Interação com usuário pedindo qual o nome e passando a primeira valor do for que é 1 para a quantidade qtd incializada em 1*/
			String idade = JOptionPane.showInputDialog("Qual a idade?");
			/*
			String dataNascimento =  JOptionPane.showInputDialog("Data de nascimento?");
			String rg = JOptionPane.showInputDialog("Registro Geral");
			String cpf =  JOptionPane.showInputDialog("Qual é o CPF?");
			String mae = JOptionPane.showInputDialog("Qual é o Nome da Mãe?");
			String pai = JOptionPane.showInputDialog("Qual é o Nome do Pai?");
			String matricula = JOptionPane.showInputDialog("Data de Matricula?");
			String serie = JOptionPane.showInputDialog("Qual é a Série?");
			String escola = JOptionPane.showInputDialog("Nome da escola?");*/
			
			Aluno aluno1 = new Aluno();/*Criando o objeto aluno*/
			
			aluno1.setNome(nome); /*setando o nome para o aluno 1*/
			aluno1.setIdade(Integer.valueOf(idade));
			/*
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);*/
			
	 		for(int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
				
				Disciplina disciplina = new Disciplina();/*Criando na meória o objeto Disciplina*/
				disciplina.setDisciplina(nomeDisciplina);/*Setando a Disciplina*/
				//disciplina.setNota(Double.valueOf(notaDisciplina));/*Setando a Nota*/
				
				aluno1.getDisciplinas().add(disciplina);/*Buscando a lista de Disciplinas no objeto Aluno e add adicionando a esta lista uma nova disciplina*/
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");/*Escolhendo se sim ou não remover uma disciplina e se caso sim escolher qual posição 0,1,2,3*/
			
			if (escolha == 0) {/*Opção Sim Zero*/
				
				int continuarRemover = 0;/*Apenas Inicializando a variável*/
				int posicao = 1;
				
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2 ,3 ou 4 ?");/*disciplinaRemover vai ser o que o usuário digitar Exemplo digitou 1 será a disciplina na posição 0 se digitar 2 será a posição 1 se digitar 3 será a posição 2 e se digitar 4 será a posição 3. pois todo array inicia na posição 0 e não com posição 1,2,3,4 e sim 0,1,2,3 correto*/
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);/*Buca a lista de Disciplinas e chama um método Remove e como uma discipçina é uma String exemplo (JAVA) ou (Matemática) é necessário conversão para inteiro pois o método remove da List.class espera um inteiro então usamos Integer.valueOf para a conversão e depois passando a discipinaRemover o retorno intvalue apenas o valor e depois diminuindo o número escolhido pelo usuário  exemplo 2 - o valor inicial da variavel posição exemplo que é 1 então fica assim a conta 2-1 = 1 dessa forma irá excluir a disciplina da posição 1 e não é isso que queremos, queremos excluir da posição 2 e então na linha de baixo inclementamos a variavel posicao que agora é 1 resultado de 2-1 =1 e que passa a ser 2 pois foi inclementada adiconado mais 1 e agora recebe o valor 2 escolheu remover a disciplina 2 que está na posição 3 do array 0,1,2,3 e diminuindo -1 onde o array agora perde uma posição ficando 0,1,2*/
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			
			alunos.add(aluno1);
	}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {/*Separei em listas*/
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else 
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);/*Reprovado*/
			}
		}
			
		System.out.println("-------------------Lista dos aprovados -----------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
					+ aluno.getMediaNota() + " Nome = " +  aluno.getNome());
		}
		
		
		System.out.println("-------------------Lista dos reprovados -----------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
					+ aluno.getMediaNota() + " Nome = " +  aluno.getNome());
		}
		
		System.out.println("-------------------Lista em Recuperacao -----------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = "
					+ aluno.getMediaNota() + " Nome = " +  aluno.getNome());	
		}
	} else {
		JOptionPane.showMessageDialog(null, "Acesso não permitido ");
		
	}
		
		}catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();/*Imprime erro no console java - importante sempre colocar isso para facilitar achar erro*/
			
			/*MEnsagem do erro ou causa*/
			System.out.println(" Mensagem: " + e.getMessage());
			
			for (int pos= 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro :  " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro :  " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Linha de erro : " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número! " + saida.toString());
			
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaa um null pointer exception :  " + e.getClass());
			
		}catch (ExecaoProcessarNota e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada : " + e.getClass().getName());
			
		}finally { /*Sempre é executado ocorrendo erros ou não.Porquê?*/
			/*Sempre é usado quando precisa executar um processo acontecendo erro ou não no sistema*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java Comigo");
		}
	}
	
	public static void lerArquivo () throws ExecaoProcessarNota{
		try {
			File fil = new File("c://lines.txt");	
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExecaoProcessarNota(e.getMessage());
		}
	}
}

