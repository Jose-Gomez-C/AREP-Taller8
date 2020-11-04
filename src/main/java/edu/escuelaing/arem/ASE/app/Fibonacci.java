package edu.escuelaing.arem.ASE.app;

/**
 * Clase encarga de hacer los c�lculos y crear la lista.
 *@author Jose Luis Gomez Camacho
 */
public class Fibonacci {
	private int resultado; 
	public Fibonacci() {
		
	}
	public int calcularFibonacci(int n){
		System.out.println(n);
		if (n>1){
			resultado =0;
			int acumulado = 1;
			System.out.println("hola llego al condi");
			for (int i = 3; i < n; i++ ) {
				resultado += acumulado; 
				acumulado = resultado - acumulado;
			}
		}
		else if (n==1) {
			resultado= 1;
		}
		else if (n==0){
			resultado = 0;
		}
		return resultado; 
	}

}
