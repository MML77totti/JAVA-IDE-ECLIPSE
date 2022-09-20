package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * 7) Escreva um algoritmo para ler as dimensões de um retângulo (base e
	 * altura), calcular e escrever a área do retângulo. Dica a=b.h
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da Base do Retangulo: ");
		int base = sc.nextInt();

		System.out.println("Digite o valor da Altura: ");
		int altura = sc.nextInt();

		int area = base * altura;

		System.out.println("A Area do seu Retangulo é : " + area);
		sc.close();
	}
}
