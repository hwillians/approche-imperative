package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
		// entiers compris entre 1 et ce nombre.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre ");
		int nb = scanner.nextInt();
		int somme = 0;
		for (int i=1; i <= nb;i++ ) {
			somme += i;
		}
		System.out.println("la somme des entiers compris entre 1 et " + nb + " est : " + somme);
		
	}

}
