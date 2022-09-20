package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular
	 * e escrever a área do quadrado. Dica a=l²
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Largura do quadrado: ");
		int lar = sc.nextInt();

		int area = lar * lar;
		System.out.println("A dimensão do quadrado é :" + area);
		sc.close();
	}
}