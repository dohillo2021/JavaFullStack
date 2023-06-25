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
		
		
		/*c�digo do sistema do usu�rio continua o fluxo de trabalho*/		
		System.out.println("Chegou ao fim do c�digo de teste de thread");
		
		/*Fluxo do sistema, de um cadastro de venda ou emiss�o de NF, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
		
	}
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*C�digo da rotina*/
			
			/*C�digo da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de Nota fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/*D� um tempo*/
			} 
			/*Fim do c�digo em paralelo*/
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*C�digo da rotina*/
			
			/*C�digo da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				
				/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de email");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/*D� um tempo*/
			} 
			/*Fim do c�digo em paralelo*/
			
		}
	};
	
}
