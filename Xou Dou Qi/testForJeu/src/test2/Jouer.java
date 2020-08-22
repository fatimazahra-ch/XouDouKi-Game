package test2;

import java.util.Random;
import java.util.Scanner;

public class Jouer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1- Déposer les animaux sur le plateau de jeu
		PlateauDeJeu P1 = new PlateauDeJeu();  //Matrice initiale
		
		Machine machine = new Machine();
		Homme homme = new Homme();
		
		// Le Plateau Initial
		P1.affichePlateauDuJeu();
		
		Random r  = new Random();
		int quiVaCommencer = r.nextInt(2);
		String animalADeplacer = new String() ;
		int posx, posy;
		
		do {
			if( quiVaCommencer == 1 ) {
				System.out.println("\n #################### Je suis l'homme ################# \n");
				
				System.out.println(" Quel est l'animal que vous souhaitez le déplacer ");
				animalADeplacer = sc.nextLine();
				
				System.out.println(" Quel est le nouvel déplacement pour cet animal ");
				posx = Integer.parseInt(sc.nextLine()) ;
				posy = Integer.parseInt(sc.nextLine()) ;
				
				homme.deplacerPiece(animalADeplacer, posx, posy, machine, P1);
				
				P1.affichePlateauDuJeu();
				
				quiVaCommencer = 2;
			
			} else {
				System.out.println("\n #################### Je suis la machine ################# \n");
				
				machine.deplacerPieceRand2(homme, P1);
				
				P1.affichePlateauDuJeu();
				
				quiVaCommencer = 1;
			}
			
			
		} while( (machine.getNombreAnimaux() > 0) && (homme.getNombreAnimaux() > 0) && (P1.getAnimalByPosition(0, 3).equals("Sanctuaire")) && (P1.getAnimalByPosition(8, 3).equals("Sanctuaire")) ); 
		
		if( machine.getNombreAnimaux() == 0 ||  !P1.getAnimalByPosition(8, 3).equals("Sanctuaire")  )
			System.out.println(" le gagant de jeu est : l'utilisateur humain  ");
		
		if( homme.getNombreAnimaux() == 0 || !P1.getAnimalByPosition(0, 3).equals("Sanctuaire") )
			System.out.println(" le gagant de jeu est : la machine  ");
		
	}

}
