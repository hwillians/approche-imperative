package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// choisit un nombre aléatoire entre 1 et 100
		int random = (int)(Math.random()*100);
		int temoin = 1;
		// puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vous devez deviner le nombre entre 1 et 100 qui a été choisit par le programme");
		int nb = scanner.nextInt(); 
		
		while (nb != random) {
			if (nb<1 || nb >100) {
				System.out.println("ce n\'est pas un nombre entre 1 et 100, esseyez à nouveau");
				nb = scanner.nextInt();
			}else if (nb < random) {
				System.out.println("le nombre que vous avaz choisi est au-dessus, esseyez à nouveau");
				nb = scanner.nextInt();
			} else {
				System.out.println("le nombre que vous avaz choisi est dessous, esseyez à nouveau");
				nb = scanner.nextInt();
			}
			temoin ++;
		}
	
		// Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur le programme se termine.
		String s = " ";
		System.out.println("Bravo, vous avez trouvé en " + temoin + " coup"+(s = temoin <2 ? " " : "s "));
		
		
	}

}
