package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * 3) Escreva um algoritmo para ler dois valores do teclado e exibir como
	 * resposta a soma dos valores.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		int valor = sc.nextInt();

		System.out.println("Digite o Segundo Valor : ");
		int valor02 = sc.nextInt();

		int soma = valor + valor02;

		System.out.println("A soma dos valores Digitado é : " + soma); sc.close();

	}

}
