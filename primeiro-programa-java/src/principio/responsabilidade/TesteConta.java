package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do William");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Resis();
		bancaria.diminui100Resis();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		System.out.println(bancaria);
		
		String string = new String();
		
	}

}
