package Intro;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Informe uma string: ");
	        String input = scanner.nextLine();

	 
	        int contador = 0;

	
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	        
	            if (c == 'a' || c == 'A') {
	                contador++;
	            }
	        }

	      
	        if (contador > 0) {
	            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vez(es).");
	        } else {
	            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string.");
	        }

	        scanner.close();
	    }

	}


