package tarefa06deLinguagemdeProgramaçãoJava;

public class Exercicio09_Exemplo02 {

	static int[] processa(int[] vetor) {
	    int[] resultado = new int[2];
	    resultado[0] = vetor[0];
	    resultado[1] = vetor[0];
	    for (int i = 1; i < vetor.length; i++) {
	        if (vetor[i] > resultado[0]) {
	            resultado[0] = vetor[i];
	        }
	        if (vetor[i] < resultado[1]) {
	            resultado[1] = vetor[i];
	        }
	    }
	    return (resultado);
	}
}
