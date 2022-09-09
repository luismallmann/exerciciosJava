/*
 2. Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) 
 um vetor numérico com 15 posições com os primeiros elementos da sequência de Fibonacci:

|  1 |  1 |  2 |  3 |  5 |  8 | 13 | 21 | 34 | 55 | 89 | 144| 233| 377| 610| 987| 
|----|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
|  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |  10|  11|  12|  13|  14|  15| 
   
 */
package br.entra21;

public class Lista02E02 {
	public static void main(String[] args) {
		int[] sequencia = new int[15];
		int ultimo = 0;
		int penultimo=0;
		
		//Para os 15 primeiros elemntos
		for(int i=0; i<15;i++) {
			
			//primeira posição
			if(i==0) {
				sequencia[i]=1;
			//segunda posição
			}else if(i==1) {
				sequencia[i]=1;
				//demais posições
			}else {
				ultimo = sequencia[i-1];
				penultimo = sequencia[i-2];
				sequencia[i]=ultimo+penultimo;
			}
		}
		
		for(int i = 0; i<15;i++) {
			System.out.print("["+i+"] "+sequencia[i]+"\t");
		}
	}
}
