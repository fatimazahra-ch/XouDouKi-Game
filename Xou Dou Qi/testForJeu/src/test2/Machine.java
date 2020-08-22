package test2;


import java.util.ArrayList;
import java.util.List;

public class Machine {

	private List<String> animaux = new ArrayList<String>();
	private List<String> testanimaux = new ArrayList<String>();
	
	public Machine() {	
		animaux.add("Lionv");
		animaux.add("Tigrev");
		animaux.add("Chienv");
		animaux.add("Chatv");
		animaux.add("Ratv");
		animaux.add("Pantherev");
		animaux.add("Loupv");
		animaux.add("Elephantv");
		
		testanimaux = animaux;
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
    			this.deplacerPiece(machineAnimal, posx-1, j, testhomme, P1);
    		  }
        }
    	return testhomme;
    }
    
    public void deplacerPieceRand2 (Homme testhomme, PlateauDeJeu P1) {
    	String machineAnimal = new String();
    	int cpt;
    	for ( int i = 1 ; i < 9 ; i++ ) {
    		cpt = i;
    		for (int j = 0 ; j < 7 ; j++) {
    		      machineAnimal = P1.getAnimalByPosition(i, j);
    		      if (machineAnimal.lastIndexOf("v") > 0) {
    		          this.deplacerPiece(machineAnimal, cpt-1, j, testhomme, P1);
//        			  testhomme = this.deplacerPiece(machineAnimal, i, j+1, P1);
//        			  testhomme = this.deplacerPiece(machineAnimal, i, j-1, P1);
    		      }
            }
    	}
    }

    public void deplacerPiece (String animal, int x, int y,Homme homme, PlateauDeJeu P1) {	
		if(animal.contains("Elephant")) {
			Elephant elephant = new Elephant();
			elephant.setName("Elephantv");
			elephant.verifieRouge(x, y, elephant,homme, P1);
		}
	    if(animal.contains("Lion")) {
	    	Lion lion = new Lion();
	    	lion.setName("Lionv");
			lion.verifieRouge(x, y, lion, homme, P1);
		}
	    if(animal.contains("Tigre")) {	
	    	Tigre tigre  = new Tigre();
	    	tigre.setName("Tigrev");
			tigre.verifieRouge(x, y, tigre,homme, P1);
		}
	    if(animal.contains("Panthere")) {
	    	Panthere panthere = new Panthere();
	    	panthere.setName("Pantherev");
			panthere.verifieRouge(x, y, panthere,homme, P1);
		}
		if(animal.contains("Chien")) {
			Chien chien = new Chien();
			chien.setName("Chienv");
			chien.verifieRouge(x, y, chien, homme, P1);
		}
		if(animal.contains("Loup")) {
			Loup loup = new Loup();
			loup.setName("Loupv");
			loup.verifieRouge(x, y, loup, homme,P1);
		}
		if ( animal.contains("Chat") ) {
			Chat chat = new Chat();
			chat.setName("Chatv");
			chat.verifieRouge(x, y, chat, homme, P1);
		}
		if(animal.contains("Rat")) {
			Rat rat = new Rat();
			rat.setName("Ratv");
			rat.verifieRouge(x, y, rat, homme, P1);
		}
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
		
		for( int i = 0 ; i < testanimaux.size() ; i++ ) {
			if( testanimaux.get(i).contains(nameAnimal) ) 
				animaux.remove(animaux.get(i));
			
		}	
	}
	
	
}
