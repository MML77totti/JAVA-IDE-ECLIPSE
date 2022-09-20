package tarefa02deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior,
	 * diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
	 */

	public static void main(String[] Args ) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a diagonal maior : ");
		int diaMaior=sc.nextInt();
		
		System.out.println("Digite a diagonal menor : ");
		int diaMenor=sc.nextInt();
		
		int area=diaMaior*diaMenor/2;
		System.out.println("Area do Losango é : "+area);

	sc.close();
	}
}
