package br.entra21;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		double numero1, numero2;
		char operacao, continuar;
		Scanner teclado = new Scanner(System.in);
		
		do
		{
			System.out.print("Digite o primeiro número: ");
			numero1=teclado.nextDouble();
			System.out.print("Digite o segundo número: ");
			numero2=teclado.nextDouble();
			System.out.print("Informe a operação desejada: ");
			operacao = teclado.next().charAt(0);
			
			switch(operacao) {
			case '+': System.out.printf("Soma: %.2f%n",(numero1 + numero2));
				break;
			case '-': System.out.printf("Diferença: %.2f%n",(numero1 - numero2));
				break;
			case '*':System.out.printf("Multiplicação:  %.2f%n",(numero1 * numero2));
				break;
			case '/': System.out.printf("Divisão: %.2f%n",(numero1 / numero2));
				break;
			default:System.out.printf("Operação Inválida");
				break;
			}
			
			System.out.print("Deseja continuar (S/N): ");
			continuar=teclado.next().charAt(0);
		}while((continuar=='S')||(continuar=='s'));

				
		teclado.close();
	}
}