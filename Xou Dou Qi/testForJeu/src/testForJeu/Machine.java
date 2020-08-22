package testForJeu;


import java.util.ArrayList;
import java.util.List;

public class Machine {

	private List<String> animaux = new ArrayList<String>();
	
	public Machine() {
		
		//Il 8 Piéces
		animaux.add("Lionv");
		animaux.add("Tigrev");
		animaux.add("Chienv");
		animaux.add("Chatv");
		animaux.add("Ratv");
		animaux.add("Panthèrev");
		animaux.add("Loupv");
		animaux.add("Eléphantv");
	}
	
    public int getNombreAnimaux() {
		return animaux.size();
	}
    
    public Homme deplacerPieceRand1 (int posx, PlateauDeJeu P1) {
    	String machineAnimal = new String();
    	Homme testhomme = null;
    	for ( int j = 0 ; j < 7 ; j++ ) {
    		  machineAnimal = P1.getAnimalByPosition(posx, j);
    		  if ( machineAnimal.lastIndexOf("v") > 0 ) {
    		       testhomme = this.deplacerPiece(machineAnimal, posx-1, j, P1);
    		  }
        }
    	return testhomme;
    }
    
    public Homme deplacerPieceRand2 (PlateauDeJeu P1) {
    	String machineAnimal = new String();
    	Homme testhomme = null;
    	for (int i = 8 ; i > 0 ; i--) {
    		for (int j = 0 ; j < 7 ; j++) {
    		      machineAnimal = P1.getAnimalByPosition(i, j);
    		      if (machineAnimal.lastIndexOf("v") > 0) {
    		    	   System.out.println("Oui...");
    		           testhomme = this.deplacerPiece(machineAnimal, i-1, j, P1);
    		      }
            }
    	}
    	return testhomme;
    }

    public Homme deplacerPiece (String animal, int x, int y, PlateauDeJeu P1) {	
		if(animal.contains("Elephant")) {
			Elephant elephant = new Elephant();
			elephant.setName("Elephantv");
			return elephant.verifieRouge(x, y, elephant, P1);
		}
	    if(animal.contains("Lion")) {
	    	Lion lion = new Lion();
	    	lion.setName("Lionv");
			return lion.verifieRouge(x, y, lion, P1);
		}
	    if(animal.contains("Tigre")) {	
	    	Tigre tigre  = new Tigre();
	    	tigre.setName("Tigrev");
			return tigre.verifieRouge(x, y, tigre, P1);
		}
	    if(animal.contains("Panthere")) {
	    	Panthere panthere = new Panthere();
	    	panthere.setName("Pantherev");
			return panthere.verifieRouge(x, y, panthere, P1);
		}
		if(animal.contains("Chien")) {
			Chien chien = new Chien();
			chien.setName("Chienv");
			return chien.verifieRouge(x, y, chien, P1);
		}
		if(animal.contains("Loup")) {
			Loup loup = new Loup();
			loup.setName("Loupv");
			return loup.verifieRouge(x, y, loup, P1);
		}
		if ( animal.contains("Chat") ) {
			Chat chat = new Chat();
			chat.setName("Chatv");
			return chat.verifieRouge(x, y, chat, P1);
		}
		if(animal.contains("Rat")) {
			Rat rat = new Rat();
			rat.setName("Ratv");
			return rat.verifieRouge(x, y, rat, P1);
		}
		return null;
	}
    
	public String getAnimaux(int pos) {
			for(int i = 0 ; i < animaux.size() ; i++ ) 
				if( i == pos )
					return animaux.get(pos);
			return null;
	}	

	public int getAnimalPosition(String animal) {	
		for(int i = 0 ; i < animaux.size() ; i++ ) 
			if( animaux.get(i).contains(animal) )
				return i;
		return -1;
	}
	
	public void removeAnimal(String nameAnimal) {
		for( int i = 0 ; i < animaux.size() ; i++ ) {
			if( animaux.get(i).contains(nameAnimal) )
				animaux.remove(i);
		}
	}
	
	
}
