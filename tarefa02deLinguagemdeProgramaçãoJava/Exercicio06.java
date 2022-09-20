package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * 6) Escreva um algoritmo para ler dois valores do teclado e exibir como
	 * resposta a divisão dos valores.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero01 = sc.nextInt();

		System.out.println("Digite um segundo nemero: ");
		int numero02 = sc.nextInt();

		int divin = numero01 / numero02;
		System.out.println("A divisão dos numeros digitado é: " + divin); sc.close();

	}
}
