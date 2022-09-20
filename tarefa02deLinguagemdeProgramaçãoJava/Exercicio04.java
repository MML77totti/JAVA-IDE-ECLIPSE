package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * 4) Escreva um algoritmo para ler dois valores do teclado e exibir como
	 * resposta a subtração dos valores.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor : ");
		int valor01 = sc.nextInt();

		System.out.println("Digite um segundo Valor : ");
		int valor02 = sc.nextInt();

		int subtra = valor01 - valor02;
		System.out.println("A subtração dos numero Digitados é : " + subtra); sc.close();

	}

}
