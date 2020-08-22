package test2;

import java.util.ArrayList;
import java.util.List;


public class PlateauDeJeu {
	
	private String[][] mat ;
	//private List<String> animaux = new ArrayList<String>();
	
	public PlateauDeJeu() {
		//Initialiser le plateau
		mat =  new String[9][7];
		//Initialiser les elements de Plateau de jeu par un vide 
		for( int i = 0 ; i < 9 ; i++ )
			for( int j = 0 ; j < 7 ; j++ )
				mat[i][j] = "          ";
			
		///Les Pièges
		mat[0][2] = "Piège";
		mat[0][4] = "Piège";
		mat[1][3] = "Piège";
		mat[8][2] = "Piège";
		mat[8][4] = "Piège";
		mat[7][3] = "Piège";
		
		///Les Sanctuaires
		mat[0][3] = "Sanctuaire";
		mat[8][3] = "Sanctuaire";
		
		///Les Riviéres
		for( int i = 3 ; i < 6 ; i++ )
			for( int j = 1 ; j < 3 ; j++ )
				mat[i][j] = "Riviére";
		
		for( int i = 3 ; i < 6 ; i++ )
			for( int j = 4 ; j < 6 ; j++ )
				mat[i][j] = "Riviére";

		Homme homme = new Homme();		
		mat[0][0] = homme.getAnimaux(0);
		mat[0][6] = homme.getAnimaux(6);
		mat[1][1] = homme.getAnimaux(1);
		mat[1][5] = homme.getAnimaux(5);
		mat[2][0] = homme.getAnimaux(4);
		mat[2][2] = homme.getAnimaux(3);
		mat[2][4] = homme.getAnimaux(2);
		mat[2][6] = homme.getAnimaux(7);
	
		//Pour la machine
		Machine machine = new Machine();
		mat[6][0] = machine.getAnimaux(0);
		mat[6][2] = machine.getAnimaux(2);
		mat[6][4] = machine.getAnimaux(4);
		mat[6][6] = machine.getAnimaux(3);
		mat[7][1] = machine.getAnimaux(1);
		mat[7][5] = machine.getAnimaux(5);
		mat[8][0] = machine.getAnimaux(7);
		mat[8][6] = machine.getAnimaux(6);
	}
	
	
	public void setMat(int i, int j, String animal) {
		mat[i][j] = animal;	
	}
	
	public String getAnimalByPosition(int i, int j) {
		return mat[i][j];
	}

	public int[] getAnimalByName(String animal) {
		int[] positions = new int[2];
		for( int i = 0 ; i < 9 ; i++ ) {
			for( int j = 0 ; j < 7 ; j++ ) {
				if( mat[i][j].contains(animal) ) {
					positions[0] = i;
					positions[1] = j;
					return positions;
				}			
			}
		}		
		return positions;
	}

	public void affichePlateauDuJeu() {
		for( int i = 0 ; i < 9 ; i++ ) {
			System.out.println("==============================================================================");
			for( int j = 0 ; j < 7 ; j++ ) {				
				System.out.print("|" + mat[i][j]);
			}
			System.out.print("|"+"\n");
		}
		System.out.println("==============================================================================");
	}
	
}
