package primos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calcular_Primos primo = new Calcular_Primos();
		
		System.out.println("Introduce el limite inferior");
		Scanner inferior = new Scanner(System.in);
	    int i = inferior.nextInt();
	    
		
		System.out.println("Introduce el limite superior");
		Scanner superior = new Scanner(System.in);
	    int j = superior.nextInt();
	    
		
		primo.establecer_limite(i,j);
		
		primo.ejecucion();
		
		
		superior.close();
		inferior.close();
	}

}
