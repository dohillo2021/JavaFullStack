package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tenha o contrato da interface de permitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	} 
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {/*quando entra aqui dentro ele passa essa interface que já é do tipo secretário atribui ao objeto na linha 9 e depois ele chama o objeto na linha 11 no metodo autenticar()*/ 
		this.permitirAcesso = acesso;
	}
	
}
