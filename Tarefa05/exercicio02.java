package tarefa05deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class PositivoOuNegativo02 {

	/*
	 * 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero
	 * como positivo).
	 */

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("Digite um valor: ");
	int valorPositivoOuNegativo = sc.nextInt();
	
	if(valorPositivoOuNegativo >= 0){
		System.out.println("O seu numero e Positivo");
	}else {
		System.out.println("O seu numero e Negativo");
	}
	
	sc.close();
	}
}
