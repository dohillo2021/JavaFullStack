package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
			new ConcurrentLinkedQueue<ObjetoFilaThread>(); /*porque static ? , porque a fila (pilha) tem que ser única pra mim*/
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		
		pilha_fila.add(objetoFilaThread);		
	}	
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		while (true) {
			
			
			synchronized (pilha_fila) { /*usamos o synchronized para Bloquear o acesso a essa lista por outros processos, garantindo que somente essa minha thread vai acessar essa lista de processamento evitando que outro processo entre no meio desse processo e atrapalhe tudo*/
				
				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual e processa e depois remove*/
					
					/*Processar 10 mil notas fiscal*/
					/*Gerar uma lista enorme de pdf*/
					/*Gerar um envio em masa de email*/
					
					System.out.println("---------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					System.out.println("---------------------------------");

					
					iteracao.remove();
					
					try {
						Thread.sleep(1000);/*Dar um tempo para descarga de memória que é importante pro sitema operacional*/
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
			
			try {
				Thread.sleep(1000);/*Processou toda a lista dá um tempo para limpeza de memória*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
