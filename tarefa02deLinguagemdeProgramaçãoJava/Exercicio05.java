package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * 5) Escreva um algoritmo para ler dois valores do teclado e exibir como
	 * resposta a multiplicação dos valores.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero01 = sc.nextInt();

		System.out.println("Digite outro numero: ");
		int numero02 = sc.nextInt();

		int multi = numero01 * numero02;
		System.out.println("A multiplicação dos 2 numero digitados: " + multi); sc.close();

	}
}
