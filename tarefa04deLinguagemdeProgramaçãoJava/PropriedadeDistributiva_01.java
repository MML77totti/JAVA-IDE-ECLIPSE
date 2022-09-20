package tarefa04deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class PropriedadeDistributiva_01 {

	/*
	 * 1) Ler quatro números inteiros e apresentar o resultado da adição e
	 * multiplicação, baseando-se na utilização do conceito da propriedade
	 * distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser
	 * somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e
	 * por fim C com D. Perceba que será necessário efetuar seis operações de adição
	 * e seis operações de multiplicação e apresentar doze resultados de saída.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		float numeroA = 10;
		float numeroB = 20;
		float numeroC = 30;
		float numeroD = 40;

		float soma1 = numeroA + numeroB;
		float soma2 = numeroA + numeroC;
		float soma3 = numeroA + numeroD;
		float soma4 = numeroB + numeroC;
		float soma5 = numeroB + numeroD;
		float soma6 = numeroC + numeroD;

		float soma7 = numeroA * numeroB;
		float soma8 = numeroA * numeroC;
		float soma9 = numeroA * numeroD;
		float soma10 = numeroB * numeroC;
		float soma11 = numeroB * numeroD;
		float soma12 = numeroC * numeroD;

		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(soma3);
		System.out.println(soma4);
		System.out.println(soma5);
		System.out.println(soma6);
		System.out.println(soma7);
		System.out.println(soma8);
		System.out.println(soma9);
		System.out.println(soma10);
		System.out.println(soma11);
		System.out.println(soma12);
		sc.close();
	}

}
