package cursojava.interfaces;

/*Essa interface ser� o nosso ocntrato de autentica��o*/

public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);/*m�todo com mesmo nome e com parametros*/
	public boolean autenticar( );/*Apenas declara��o do m�todo sem parametros*/
	
}
