package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de pessoa qye extende de pessoa*/
public class Diretor extends Pessoa implements PermitirAcesso{ /*Coloquei implements Permitir acesso para poder fazer com que o diretor tenha acessos*/

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	/*Diretor tem que ter esses atributos para participar da autenticacao*/
	private String login;
	private String senha;
	
	/*Criando construtor de diretor recebendo login e senha para acessos e apontando para essa classe o login e senha -  this.login e this.senha */
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	/* E para n�o quebrar as outras classes a gente deixa um construtor padr�o sem atributos*/
	public Diretor() {
		
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	@Override
		public double salario() {
			return 3900.78;
		}
	
	/*Necess�rio para participar da autentica��o*/
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("william") && senha.equals("123");
	}
}
