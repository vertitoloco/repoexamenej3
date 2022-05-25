package ej2ex;

public class ejercicio {
	public static void main (String [] args) {
		String [] nombres = {"ana", "julia", "antonio"};
		contarVocales(nombres);
	}
	public static void contarVocales (String [] nombres) {
        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;
  for (int e=0; e<nombres.length; e++) {
	  String palabra;
	  	palabra = nombres[e];
        for (int i = 0; i <palabra.length(); i++){
            if (palabra.charAt(i) == 'a') {
            	conta++;
            }else if (palabra.charAt(i) == 'e') {
            	conte++;
            }else if (palabra.charAt(i) == 'i') {
            	conti++;
            }else if (palabra.charAt(i) == 'o') {
            	conto++;
            }else if (palabra.charAt(i) == 'u') {
            	contu++;
            }
             	
        	}
  		}
  	System.out.println("Numero de vocales A : "+conta);
  	System.out.println("Numero de vocales E : "+conte);
  	System.out.println("Numero de vocales I : "+conti);
  	System.out.println("Numero de vocales O : "+conto);
  	System.out.println("Numero de vocales U : "+contu);
	}
}
