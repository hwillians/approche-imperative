package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.
		int [] nombres = new int [10];
		for (int i = 1; i <=10; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Veuillez saisir le nombre N° " + i);
			int nb = scanner.nextInt();
			nombres[i-1]=nb;
		}
		int temoin = 0;
		int temoinI = 0;
		
		// Rechercher le plus grand élément du tableau
		
		for (int i = 0; i < 10; i++) {
			if(nombres[i]>temoin) {
				temoin = nombres [i];
				temoinI = i+1;
			}
		}
		System.out.println("Le plus grand élémént saisi " + temoin + " dans la position : " + temoinI);
	}

}
