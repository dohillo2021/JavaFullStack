package curso.java.excecao;

public class ExecaoProcessarNota  extends Exception {

	public ExecaoProcessarNota(String erro) {
		super("Vixxx um erro no processamento do arquivo ao processar as notas do aluno" + erro);
	}
	
}
