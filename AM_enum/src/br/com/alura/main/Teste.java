package br.com.alura.main;

/**
 * Demostração de Threads e seus níveis de prioridade.
 * @author devpovoa
 * @version 0.1
 */
public class Teste {

	public static void main(String[] args) {

		Thread t = new Thread(() -> System.out.println("rodando...."));

		/**
		 * método que define o nivel de prioridade da thread.
		 */
		System.out.println("Nível de prioridade: " + Thread.MIN_PRIORITY);
		System.out.println("Nível de prioridade: " + Thread.NORM_PRIORITY);
		System.out.println("Nível de prioridade: " + Thread.MAX_PRIORITY);
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		/**
		 * método que starta a Thread.
		 */
		t.start();
	}

}