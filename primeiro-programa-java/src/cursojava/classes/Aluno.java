package cursojava.classes;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/* Esta é a classe /objeto que representa o Aluno*/
public class Aluno extends Pessoa {
/* Esses são os atributos de Aluno*/
	
	
	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola; 
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

	/*3 construtores Default, com 1 parametro e com 2 parametros*/
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		super.nome = nomePadrao;
		idade = idadePadrao;
	}

	
	/*Agora Veremos os metodos Setters e getters do objeto*/
	/* SET é para adicionar ou receber dados para os atributos*/
	/*Get é para resgatar ou obter o valor do atributo*/
	
	/*Resgata, retorna valor*/
	public String getNome() {
		return nome;
	}

	/*Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	//Método que retorna a média do aluno
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		
		return somaNotas / disciplinas.size(); //Dessa forma se a lista aumentar será incrementado aqui por quantas disciplinas a média será dividida/*
	}
	
	/*Normalmente em back trabalhamos com boolean, pois fica mais facil manipular em qualquer lugar*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {/*Aprovado*/
			return true;
		} else {
			return false;/*Reprovado*/
		}
	}
	
	/*Normalmente é mais usado a responsabilidade da String para o Front (tela)*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();/*O operador this siginifica que vamos fazer uma chamada para algum método ou para alguma variável dentro do próprio objeto. Nesta linah estamos atribuindo o resultado do método getMediaNota ao valor da variavel Media*/
		if (media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}
	
	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", serieMatriculado=" + serieMatriculado + ", nomeEscola="
				+ nomeEscola + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	
	@Override /*Identifica método sobreescrito*/
		public boolean pessoaMaiorIdade() {
			return idade >= 21;
		}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba Aluno é maior de idade" :"Ixii vc é menor de idade";/*Operador Ternário*/
	}
	
	
	@Override
		public double salario() {
			return 1500.90;
		}
}
