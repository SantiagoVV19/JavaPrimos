package primos;
import java.util.Scanner;

public class Calcular_Primos {
	
	private static int limite_superior;
	private static int limite_inferior;
	
	public Calcular_Primos(){
		this(1,100);
	}
	
	public Calcular_Primos(int m,int n){
		limite_superior = n;
		limite_inferior = m;
		
	}
	
	
	
	/* Usar solo la lista de primos  y si el limite es 100 pues solo llegar hasta el primo 7 , ya que 7 por 7 es 49
	 * 
	 * usamos la raiz cuadrada del numero, el algoritmo de euclide no es necesario pero se puede hacer 
	 * 
	 * floan(raiz del numero) = devuelve el valor
	 */
	
	
	public void establecer_limite(int x,int y) {
	
		limite_inferior = x;
		limite_superior = y;
	}
	
	
	public static void num_rango() {
		int resultado= (int) Math.sqrt(limite_superior);
		
		limite_superior = resultado;
		
		
		
	}
	
	
	
	public static int[] ListaPrimos() {
		
		
		
		int  lista[] = new int[limite_superior];
		int c = 0;
		for ( int i = limite_inferior; i <= limite_superior; i++ ) {
			
			for( int j = 2; j <= i; j++) {
				
				if(i % j != 0){
					System.out.print(" | " + i);
				//	lista[c] = i;
				//	c++;
				}
				
			}
			
		}
		
		return lista;
	}
	
	
	public static void ejecucion() {
		
		num_rango();
		int h[] = ListaPrimos();
		write(h);
		
		
	}
	
	public static void write(int c[]) {
		
		for (int i = 0; i <= c.length;i++) {
			
			System.out.print(" | " + c[i]);
		}
		
	}
	
	
	public static boolean isPrime(final int n) {
		
		
		
		for ( int i = limite_inferior; i <= limite_superior; i++ ) {
			
			for( int j = 2; j <= i; j++) {
				
				if (i % j == 0)
					return false;
				else
					return true;
				
			}
			
		}
		
		
		
		return true;
	}
	
	

	
	
	public int suma() {
		return 1;
	}
	
	
	public void print() {
		System.out.println("algo");
	}
	
	
	
	

}
