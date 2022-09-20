package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio08 {

	/*
	 * 8) Escreva um algoritmo para ler as dimensões de um triângulo (base e
	 * altura), calcular e escrever a área do triângulo. Dica a=b.h/2
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Base do seu Triangulo : ");
		int base = sc.nextInt();

		System.out.println("Digite Altura do seu Triangulo : ");
		int altura = sc.nextInt();

		int dim = base * altura / 2;
		System.out.println("A dimensão do seu Triangulo é : " + dim);
		sc.close();
	}
}
