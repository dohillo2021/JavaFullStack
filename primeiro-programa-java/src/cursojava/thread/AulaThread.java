package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1) ;
		threadEmail.start();
		
		/*Thread processando em paralelo do envio de Nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		/*código do sistema do usuário continua o fluxo de trabalho*/		
		System.out.println("Chegou ao fim do código de teste de thread");
		
		/*Fluxo do sistema, de um cadastro de venda ou emissão de NF, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
		
	}
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*Código da rotina*/
			
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de Nota fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/*Dá um tempo*/
			} 
			/*Fim do código em paralelo*/
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*Código da rotina*/
			
			/*Código da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/*Dá um tempo*/
			} 
			/*Fim do código em paralelo*/
			
		}
	};
	
}
