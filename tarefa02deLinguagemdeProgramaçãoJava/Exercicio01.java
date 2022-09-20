package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o
	 * número sucessor.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");

		int numero=sc.nextInt();
		int sucessor=numero+1;
		System.out.println("O numero Sucesor é :"+sucessor); sc.close();
		
	}

}
