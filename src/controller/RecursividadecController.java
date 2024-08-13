package controller;
/*
 * 4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
duplo de 5 é:
 */
public class RecursividadecController {

	public RecursividadecController() {
		
	}
	
	public int fatorialDuplo(int x) {
		if (x>1) {
			return x * fatorialDuplo(x-2);
		}
		else {
			return 1;
		}
	}
}
