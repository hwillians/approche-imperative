package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 2;
		int batons = 21;
		
		while (batons >0) {
			// l'ordinateur 
			int choixOrdi = min + (int)(Math.random() * ((max - min) + 1));
			batons -= choixOrdi;
			System.out.println("La machine jeue : " + choixOrdi + " il en reste : " + batons + "\n");
			if (batons <=0) {
				System.out.println("vous avez gangé");
				break;
			}
			
			//L'utilisateur
			while (true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("C\'est votre tour, choisissez entre 1, 2 ou 3 battons" + "\n");
				int nb = scanner.nextInt();
				if (nb >0 && nb <=3){
				batons -= nb;
				System.out.println("Vous jeuez : " + nb + " il en reste : " + batons + "\n");
				break;
				} 
				if (batons <=0) {
					System.out.println("vous avez Perdu");
					break;
				}
			
			}
		
		}
		
		
	}

}
