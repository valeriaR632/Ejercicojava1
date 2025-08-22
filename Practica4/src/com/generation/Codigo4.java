package com.generation;

import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {//no llamaba al metodo main
		Scanner s = new Scanner(System.in);////Crear un objeto de tipo scanner
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //Se debe declarar aljugador 2
	    //Scanner s2 = new Scanner(); //llama nuevamente un scanner que ya se declaro
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {//un parentesis demas 
	      System.out.println("Empate");
	    
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }//falta cerrar la condicio if
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  
		
	}//main

}//class Codigo4
