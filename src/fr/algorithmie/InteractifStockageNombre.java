package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// Faire un programme avec le menu suivant :
		//1. Ajouter un nombre
		// 2. Afficher les nombres existants.
		// Description :
		// Demander à l’utilisateur de choisir une option dans le menu
		Scanner scanner = new Scanner(System.in);
		int [] tab = new int [0];
		boolean sortie = true;
		while (sortie) {
			System.out.println("\n Choisissez une option dans le menu \n1. Ajouter un nombre \n2. Afficher les nombres existants. \n");
			int nb = scanner.nextInt();
		
			switch (nb) {
				case (1) :
				// Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.
				
					System.out.println("\n Saissez un nombre à ajuter au tableau");
					int nombre = scanner.nextInt();
					int[] tabTemp = new int [tab.length+1];
					for (int i = 0; i < tabTemp.length - 1; i++) {
						tabTemp[i] = tab[i];
						
					}
					tabTemp[tabTemp.length - 1] = nombre;
					tab = tabTemp;
				break; 
				case (2) :
				// Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
					for (int i=0; i<tab.length; i++) {
						System.out.print(tab[i] + " ");
					}
				break;
				default:
					sortie = false;
				break;
			}
		}
	}

}
