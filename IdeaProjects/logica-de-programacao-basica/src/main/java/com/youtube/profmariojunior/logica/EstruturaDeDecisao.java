package com.youtube.profmariojunior.logica;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
    	
    	numeroPar();
    	stringIgual();
    }
    
    private static void numeroPar() {
		Integer num = 2;
    	
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
	}

	private static void stringIgual() {
		String frase = "Hoje é segunda-feira";
    	
        if (frase.contains("segunda-feira")) {
            System.out.println("tristeza");
        } else if (frase.contains("sexta-feira") || frase.contains("sabado") || frase.contains("domingo")) {
        	System.out.println("ALEGRIAAAAAAAAA!");
        } else {
            System.out.println("dia normal");
        }
	}
}
