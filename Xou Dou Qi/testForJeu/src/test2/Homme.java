package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Homme {

	private List<String> animaux = new ArrayList<String>();
	
	public Homme() {
		//Il a 8 Piéces
		animaux.add("Lionr");
		animaux.add("Tigrer");
		animaux.add("Chienr");
		animaux.add("Chatr");
		animaux.add("Ratr");
		animaux.add("Pantherer");
		animaux.add("Loupr");
		animaux.add("Elephantr");	
	}
	
	public int getNombreAnimaux() {
		return animaux.size();
	}
	
	public void deplacerPiece (String animal, int x, int y,Machine machine, PlateauDeJeu P1) {	
		if(animal.contains("Elephant")) {
			Elephant elephant = new Elephant();
			elephant.setName("Elephantr");
			elephant.verifieVert(x, y, elephant,machine, P1);
		}
	    if(animal.contains("Lion")) {
	    	Lion lion = new Lion();
	    	lion.setName("Lionr");
		    lion.verifieVert(x, y, lion,machine, P1);
		}
	    if(animal.contains("Tigre")) {	
	    	Tigre tigre  = new Tigre();
	    	tigre.setName("Tigrer");
			tigre.verifieVert(x, y, tigre,machine, P1);
		}
	    if(animal.contains("Panthere")) {
	    	Panthere panthere = new Panthere();
	    	panthere.setName("Pantherer");
			panthere.verifieVert(x, y, panthere,machine, P1);
		}
		if(animal.contains("Chien")) {
			Chien chien = new Chien();
			chien.setName("Chienr");
			 chien.verifieVert(x, y, chien,machine, P1);
		}
		if(animal.contains("Loup")) {
			Loup loup = new Loup();
			loup.setName("Loupr");
			 loup.verifieVert(x, y, loup,machine, P1);
		}
		if ( animal.contains("Chat") ) {
			System.out.println("Chat /// oui1");
			Chat chat = new Chat();
			chat.setName("Chatr");
			 chat.verifieVert(x, y, chat, machine,P1);
		}
		if(animal.contains("Rat")) {
			Rat rat = new Rat();
			rat.setName("Ratr");
			rat.verifieVert(x, y, rat, machine,P1);
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
		int j = -1;
		for( int i = 0 ; i < animaux.size() ; i++ ) {
			if( animaux.get(i).contains(nameAnimal) ) {
				j=i;
				break;
			}	
		}	
		animaux.remove(animaux.get(j)); 
	}
	
}
