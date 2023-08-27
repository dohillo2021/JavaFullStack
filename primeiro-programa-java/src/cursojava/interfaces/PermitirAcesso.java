package cursojava.interfaces;

/*Essa interface será o nosso ocntrato de autenticação*/

public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);/*método com mesmo nome e com parametros*/
	public boolean autenticar( );/*Apenas declaração do método sem parametros*/
	
}
