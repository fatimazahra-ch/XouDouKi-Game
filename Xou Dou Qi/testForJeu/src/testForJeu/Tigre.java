package testForJeu;

public class Tigre extends Animal{
	
	public Tigre() {
		force = 6;
		name  = "Tigre";
	}
	
	public Homme verifieRouge ( int posx, int posy, Animal an , PlateauDeJeu P1) {
			int[] pos = P1.getAnimalByName(an.getName());
			if( pos[1] == posy ) {
					if( pos[0] == posx ) 
							System.out.println("Vous changer rien... ");
					else if( posx > pos[0] ) {
							for( int i = pos[0]+1 ; i <= posx ; i++ ) {
									String animalInMyWay = P1.getAnimalByPosition(i, posy);
									if( animalInMyWay.lastIndexOf("r") ==  animalInMyWay.length()-1 ) {
											if(animalInMyWay.contains("Elephant")) {	
												Elephant elephant = new Elephant();
												if ( an.force > elephant.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else if ( an.force == elephant.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;
												}
											}
										    if(animalInMyWay.contains("Lion")) {
										    	 Lion lion = new Lion();
										    	 if ( an.force > lion.force ) {
										    		    Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
											   } else if ( an.force == lion.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
											   } else {
												   if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null; //Sinon return null ==> Donner le role a l'adversaire
											   }
											}
										    if(animalInMyWay.contains("Tigre")) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
											}
										    if(animalInMyWay.contains("Panthere")) {
										    	Panthere panthere = new Panthere();
										    	if ( an.force > panthere.force ) {
										    		   Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(i-1, posy, "          ");
													   P1.setMat(i, posy, an.getName());
													   return adversaire;
												} else if( an.force == panthere.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
														if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
															P1.setMat(i-2, posy, an.getName());
															P1.setMat(i-1, posy, "          ");
														}
														return null;
												}
											}
											if(animalInMyWay.contains("Chien")) {
												Chien chien = new Chien();
											   	if ( an.force > chien.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(i-1, posy, "          ");
													   P1.setMat(i, posy, an.getName());
													   return adversaire;
												} else if( an.force == chien.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;												
												}
											}
											if(animalInMyWay.contains("Loup")) {
												Loup loup = new Loup();
											   	if ( an.force > loup.force ) {
											   		   Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(i-1, posy, "          ");
													   P1.setMat(i, posy, an.getName());
													   return adversaire;
												} else if( an.force == loup.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Chat")) {
												Chat chat = new Chat();
											   	if ( an.force > chat.force ) {
											   		   Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(i-1, posy, "          ");
													   P1.setMat(i, posy, an.getName());
													   return adversaire;
												} else if( an.force == chat.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Rat")) {	
												Rat rat = new Rat();
											   	if ( an.force > rat.force ) {
											   		   Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(i-1, posy, "          ");
													   P1.setMat(i, posy, an.getName());
													   return adversaire;
												} else if( an.force == rat.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;
												}
										    }	
									} else if( animalInMyWay.equals("          ") ) {
										P1.setMat(i, posy, an.getName());
										P1.setMat(i-1, posy, "          ");
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
										return null;
									}
							}
					} else {
						for( int i = pos[0]-1 ; i >= posx ; i-- ) {
							String animalInMyWay = P1.getAnimalByPosition(i, posy);
							if( animalInMyWay.lastIndexOf("r") == animalInMyWay.length()-1 ) {
									if(animalInMyWay.contains("Elephant")) {	
										Elephant elephant = new Elephant();
										if ( an.force > elephant.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else if ( an.force == elephant.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
									}
								    if(animalInMyWay.contains("Lion")) {
								    	 Lion lion = new Lion();
								    	 if ( an.force > lion.force ) {
								    		    Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
									   } else if ( an.force == lion.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
									   } else {
										   if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
									   }
									}
								    if(animalInMyWay.contains("Tigre")) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
									}
								    if(animalInMyWay.contains("Panthere")) {
								    	Panthere panthere = new Panthere();
								    	if ( an.force > panthere.force ) {
								    		   Homme adversaire = new Homme();
											   adversaire.removeAnimal(animalInMyWay);
											   P1.setMat(i+1, posy, "          ");
											   P1.setMat(i, posy, an.getName());
											   return adversaire;
										} else if( an.force == panthere.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
									}
									if(animalInMyWay.contains("Chien")) {
										Chien chien = new Chien();
									   	if ( an.force > chien.force ) {
									   		Homme adversaire = new Homme();
											   adversaire.removeAnimal(animalInMyWay);
											   P1.setMat(i+1, posy, "          ");
											   P1.setMat(i, posy, an.getName());
											   return adversaire;
										} else if( an.force == chien.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
									}
									if(animalInMyWay.contains("Loup")) {
										Loup loup = new Loup();
									   	if ( an.force > loup.force ) {
									   		   Homme adversaire = new Homme();
											   adversaire.removeAnimal(animalInMyWay);
											   P1.setMat(i+1, posy, "          ");
											   P1.setMat(i, posy, an.getName());
											   return adversaire;
										} else if( an.force == loup.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
									}
									if(animalInMyWay.contains("Chat")) {
										Chat chat = new Chat();
									   	if ( an.force > chat.force ) {
									   		   Homme adversaire = new Homme();
											   adversaire.removeAnimal(animalInMyWay);
											   P1.setMat(i+1, posy, "          ");
											   P1.setMat(i, posy, an.getName());
											   return adversaire;
										} else if( an.force == chat.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
							        }
									if(animalInMyWay.contains("Rat")) {	
										Rat rat = new Rat();
									   	if ( an.force > rat.force ) {
									   		   Homme adversaire = new Homme();
											   adversaire.removeAnimal(animalInMyWay);
											   P1.setMat(i+1, posy, "          ");
											   P1.setMat(i, posy, an.getName());
											   return adversaire;
										} else if( an.force == rat.force ) {
												Homme adversaire = new Homme();
												adversaire.removeAnimal(animalInMyWay);
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
												return adversaire;
										} else {
											if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
												P1.setMat(i+2, posy, an.getName());
												P1.setMat(i+1, posy, "          ");
											}
											return null;
										}
								    }	
							} else if( animalInMyWay.equals("          ") ) {
								P1.setMat(i, posy, an.getName());
								P1.setMat(i+1, posy, "          ");
							} else {
								System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
								return null;

							}
						}
					}
			} else {
					if( pos[0] == posx ) {
							if ( pos[1] < posy ) {
								// right...
								for( int i = pos[1]+1 ; i <= posy ; i++) {
									String animalInMyWay = P1.getAnimalByPosition(posx, i);
									if( animalInMyWay.lastIndexOf("r") == animalInMyWay.length()-1 ) {
											if(animalInMyWay.contains("Elephant")) {	
												Elephant elephant = new Elephant();
												if ( an.force > elephant.force ) {
														Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else if ( an.force == elephant.force ) {
													    Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
											}
										    if(animalInMyWay.contains("Lion")) {
										    	 Lion lion = new Lion();
										    	 if ( an.force > lion.force ) {
										    		    Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
											   } else if ( an.force == lion.force ) {
												        Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
											   } else {
												   if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
											   }
											}
										    if(animalInMyWay.contains("Tigre")) {
										    	
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												
											}
										    if(animalInMyWay.contains("Panthere")) {
										    	Panthere panthere = new Panthere();
										    	if ( an.force > panthere.force ) {
										    		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i-1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == panthere.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Chien")) {
												Chien chien = new Chien();
											   	if ( an.force > chien.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i-1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == chien.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Loup")) {
												Loup loup = new Loup();
											   	if ( an.force > loup.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i-1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == loup.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Chat")) {
												Chat chat = new Chat();
											   	if ( an.force > chat.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i-1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == chat.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
									        }
											if(animalInMyWay.contains("Rat")) {	
												Rat rat = new Rat();
											   	if ( an.force > rat.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i-1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == rat.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
														P1.setMat(posx, i-2, an.getName());
														P1.setMat(posx, i-1, "          ");
													}
													return null;
												}
										    }	
									} else if( animalInMyWay.equals("          ") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i-1, "          ");
									} else {
										System.out.println(" ####### Déplacer '"+ P1.getAnimalByPosition(posx, i)+"' en avant dabord !! ########### ");
										return null;
									}
								
								}
							} else {
								// left...
								for( int i = pos[1]-1 ; i >= posy ; i-- ) {
									String animalInMyWay = P1.getAnimalByPosition(posx, i);
									if( animalInMyWay.lastIndexOf("r") == animalInMyWay.length()-1 ) {
											if(animalInMyWay.contains("Elephant")) {	
												Elephant elephant = new Elephant();
												if ( an.force > elephant.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else if ( an.force == elephant.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}
											}
										    if(animalInMyWay.contains("Lion")) {
										    	 Lion lion = new Lion();
										    	 if ( an.force > lion.force ) {
										    		 Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
											   } else if ( an.force == lion.force ) {
												   Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
											   } else {
												   if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
											   }
											}
										    if(animalInMyWay.contains("Tigre")) {
										 
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												
											}
										    if(animalInMyWay.contains("Panthere")) {
										    	Panthere panthere = new Panthere();
										    	if ( an.force > panthere.force ) {
										    		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i+1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == panthere.force ) {
													    Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Chien")) {
												Chien chien = new Chien();
											   	if ( an.force > chien.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i+1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == chien.force ) {
													Homme adversaire = new Homme();
														adversaire.removeAnimal(animalInMyWay);
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Loup")) {
												Loup loup = new Loup();
											   	if ( an.force > loup.force ) {
											   		Homme adversaire = new Homme();
													   adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i+1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == loup.force ) {
													Homme adversaire = new Homme();													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}
											}
											if(animalInMyWay.contains("Chat")) {
												Chat chat = new Chat();
											   	if ( an.force > chat.force ) {
											   		Homme adversaire = new Homme();						
											   		adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i+1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == chat.force ) {
													Homme adversaire = new Homme();			
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}

									        }
											if(animalInMyWay.contains("Rat")) {	
												Rat rat = new Rat();
											   	if ( an.force > rat.force ) {
											   		Homme adversaire = new Homme();						
											   		adversaire.removeAnimal(animalInMyWay);
													   P1.setMat(posx, i+1, "          ");
													   P1.setMat(posx, i, an.getName());
													   return adversaire;
												} else if( an.force == rat.force ) {
													Homme adversaire = new Homme();			
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
														return adversaire;
												} else {
													if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
														P1.setMat(posx, i+2, an.getName());
														P1.setMat(posx, i+1, "          ");
													}
													return null;
												}
										    }	
									} else if( animalInMyWay.equals("          ") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i+1, "          ");
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
										return null;
									}
								
								}

							}
					} else {
							System.out.println("Impossible de se déplacer , il faut choisir de se déplacer selon une seule direction suivant x ou y...");
							return null;
					}
			}
			return null;	
	}
	
	
	public Machine verifieVert ( int posx, int posy, Animal an, PlateauDeJeu P1 ) {
		int[] pos = P1.getAnimalByName(an.getName());
		if( pos[1] == posy ) {
				if( pos[0] == posx ) 
						System.out.println("Vous changer rien... ");
				else if( posx > pos[0] ) {
						for( int i = pos[0]+1 ; i <= posx ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(i, posy);
								if( animalInMyWay.lastIndexOf("v") > 0 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else if ( an.force == elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null;
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
									    		    Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
										   } else if ( an.force == lion.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
										   } else {
											   if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null; //Sinon return null ==> Donner le role a l'adversaire
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
									    		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   return adversaire;
											} else if( an.force == panthere.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return null;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
										   		Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   return adversaire;
											} else if( an.force == chien.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null;												
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   return adversaire;
											} else if( an.force == loup.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   return adversaire;
											} else if( an.force == chat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   return adversaire;
											} else if( an.force == rat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return null;
											}
									    }	
								} else if( animalInMyWay.equals("          ") ) {
									P1.setMat(i, posy, an.getName());
									P1.setMat(i-1, posy, "          ");
								} else {
									System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
									return null;
								}
						}
				} else {
					for( int i = posx+1 ; i <= pos[0] ; i++ ) {
						String animalInMyWay = P1.getAnimalByPosition(i, posy);
						if( animalInMyWay.lastIndexOf("v") > 0 ) {
								if(animalInMyWay.contains("Elephant")) {	
									Elephant elephant = new Elephant();
									if ( an.force > elephant.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else if ( an.force == elephant.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
								}
							    if(animalInMyWay.contains("Lion")) {
							    	 Lion lion = new Lion();
							    	 if ( an.force > lion.force ) {
							    		    Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
								   } else if ( an.force == lion.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
								   } else {
									   if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
								   }
								}
							    if(animalInMyWay.contains("Tigre")) {
							    	
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									
								}
							    if(animalInMyWay.contains("Panthere")) {
							    	Panthere panthere = new Panthere();
							    	if ( an.force > panthere.force ) {
							    		   Machine adversaire = new Machine();
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i-1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   return adversaire;
									} else if( an.force == panthere.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
								}
								if(animalInMyWay.contains("Chien")) {
									Chien chien = new Chien();
								   	if ( an.force > chien.force ) {
								   		Machine adversaire = new Machine();
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i-1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   return adversaire;
									} else if( an.force == chien.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
								}
								if(animalInMyWay.contains("Loup")) {
									Loup loup = new Loup();
								   	if ( an.force > loup.force ) {
								   		   Machine adversaire = new Machine();
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i-1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   return adversaire;
									} else if( an.force == loup.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
								}
								if(animalInMyWay.contains("Chat")) {
									Chat chat = new Chat();
								   	if ( an.force > chat.force ) {
								   		   Machine adversaire = new Machine();
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i-1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   return adversaire;
									} else if( an.force == chat.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
						        }
								if(animalInMyWay.contains("Rat")) {	
									Rat rat = new Rat();
								   	if ( an.force > rat.force ) {
								   		   Machine adversaire = new Machine();
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i-1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   return adversaire;
									} else if( an.force == rat.force ) {
											Machine adversaire = new Machine();
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											return adversaire;
									} else {
										if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
											P1.setMat(i-2, posy, an.getName());
											P1.setMat(i-1, posy, "          ");
										}
										return null;
									}
							    }	
						} else if( animalInMyWay.equals("          ") ) {
							P1.setMat(i, posy, an.getName());
							P1.setMat(i-1, posy, "          ");
						} else {
							System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
							return null;
						}
					}
				}
		} else {
				if( pos[0] == posx ) {
						if ( pos[1] > posy ) {
							// right...
							for( int i = posy+1 ; i <= pos[1] ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(posx, i);
								if( animalInMyWay.lastIndexOf("v") > 0 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else if ( an.force == elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
									    		    Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										   } else if ( an.force == lion.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										   } else {
											   if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
									    		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == panthere.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
										   		Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == chien.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == loup.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == chat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
								
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == rat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
									    }	
								} else if( animalInMyWay.equals("          ") ) {
									P1.setMat(posx, i, an.getName());
									P1.setMat(posx, i-1, "          ");
								} else {
									System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
									return null;
								}
							
							}
						} else {
							// left...
							for( int i = pos[1]+1 ; i <= posy ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(posx, i);
								if( animalInMyWay.lastIndexOf("v") > 0 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else if ( an.force == elephant.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
									    		    Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										   } else if ( an.force == lion.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										   } else {
											   if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
			    									Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
									    		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == panthere.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
										   		Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == chien.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == loup.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == chat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
								
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
										   		   Machine adversaire = new Machine();
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   return adversaire;
											} else if( an.force == rat.force ) {
													Machine adversaire = new Machine();
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													return adversaire;
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return null;
											}
									    }	
								} else if( animalInMyWay.equals("          ") ) {
									P1.setMat(posx, i, an.getName());
									P1.setMat(posx, i-1, "          ");
								} else {
									System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
									return null;
								}
							
							}

						}
				} else {
						System.out.println("Impossible de se déplacer , il faut choisir de se déplacer selon une seule direction suivant x ou y...");
						return null;
				}
		}
		return null;	
  }
}
