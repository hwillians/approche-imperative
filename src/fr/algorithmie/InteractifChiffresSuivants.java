package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche
		// les 10 nombres suivants.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();

		System.out.println("les 10 nombres qui suivent sont : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print((i + nb) + ", ");
		}

	}

}
