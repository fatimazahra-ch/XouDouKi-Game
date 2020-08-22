package testForJeu;

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
		String animalADeplacerH = new String(), animalADeplacerM = new String();
		int posx = 8, posy;
		
		do {
			if( quiVaCommencer == 1 ) {
				System.out.println("\n #################### Je suis l'homme ################# \n");
				
				System.out.println(" Quel est l'animal que vous souhaitez le déplacer ");
				animalADeplacerH = sc.nextLine();
				
				System.out.println(" Quel est le nouvel déplacement pour cet animal ");
				posx = Integer.parseInt(sc.nextLine()) ;
				posy = Integer.parseInt(sc.nextLine()) ;
				
				Machine testMachine = homme.deplacerPiece(animalADeplacerH, posx, posy, P1);
				P1.affichePlateauDuJeu();
				
				if( testMachine != null ) 
					machine = testMachine;
				
				quiVaCommencer = 2;
		
			} else {
				System.out.println("\n #################### Je suis la machine ################# \n");
				
				Homme testHomme  = machine.deplacerPieceRand2(P1);
				P1.affichePlateauDuJeu();
				if( testHomme != null ) 
					homme = testHomme;
				
				quiVaCommencer = 1;
			}
			
		} while( (machine.getNombreAnimaux() > 0) && (homme.getNombreAnimaux() > 0) ); 
		
		if( machine.getNombreAnimaux() == 0 )
			System.out.println(" le gagant de jeu est l'utilisateur humain  ");
		
		if( homme.getNombreAnimaux() == 0 )
			System.out.println(" le gagant de jeu est la machine  ");
		
	}

}
