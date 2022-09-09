/*
  1. Crie um programa para armazenar informações meteorológicas. 
    - Crie um vetor para armazenar 30 temperaturas.
    - Calcular a média das temperaturas.
    - O usuário pode informar um dia qualquer e o programa deve dizer se a temperatura desse dia 
    estava acima ou abaixo da média.  
 */
package br.entra21;

import java.util.Scanner;

public class Lista02E01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] temperaturas= new double[30];
		double soma=0;
		double media = 0;
		int dia;
		
		//Faz a leita das temperaturas
		for(int i=1; i<=30;i++) {
			System.out.println("Informe a temperatura ("+i+"/30): ");
			temperaturas[i]=teclado.nextDouble();
			
			//Soma as temperaturas informadas
			soma+=temperaturas[i];
		}
		
		//Calcula a média total
		media = soma / 30;
		
		System.out.println("\n \n");
		System.out.print("Informe o dia desejado(1-30): ");
		dia = teclado.nextInt();
		
		//Exibe o resultado conforme a temperatura do dia e a média calculada
		if(temperaturas[dia] > media) {
			System.out.printf("No dia %d a temperatura era %.2f°C. A média do mês é %.2f°C. "
					+ "Logo, a tempearatura é MAIOR que a média", dia, temperaturas[dia],media);
		}else if(temperaturas[dia] < media) {
			System.out.printf("No dia %d a temperatura era %.2f°C. A média do mês é %.2f°C. "
					+ "Logo, a tempearatura é MENOR que a média", dia, temperaturas[dia],media);
		}else {
			System.out.printf("No dia %d a temperatura era %.2f°C. A média do mês é %.2f°C. "
					+ "Logo, a tempearatura é IGUAL que a média", dia, temperaturas[dia],media);
		}
		
		teclado.close();
	}
}
