package cursojava.interfaces;

/*Essa interface será o nosso ocntrato de autenticação*/

public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	public boolean autenticar( );
	
}
