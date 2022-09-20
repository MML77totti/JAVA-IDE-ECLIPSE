package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o
	 * número antecessor.
	 */

	public static void main(String[] Args) {

		System.out.println("Escreva um numero para ação.");
		
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int antecessor = numero - 1;
		System.out.println("O numero Antecessor é : " + antecessor); sc.close();
	}
}
