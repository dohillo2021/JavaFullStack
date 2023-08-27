package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do William");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		System.out.println(bancaria);
		
		String string = new String();// criando um objeto String do java, existem muitos m�todos dentro dele 
		
		//String.  (e ap�s o ponto aparece todos os m�todos do objeto String
		
	}

}
