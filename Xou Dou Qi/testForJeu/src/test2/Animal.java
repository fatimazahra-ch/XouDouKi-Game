package test2;

public class Animal {
	
	protected int force;
	protected String name;
	
	public int getForce() { return force; }
	
	public void setForce(int force) { this.force = force; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	public int verifieRouge ( int posx, int posy, Animal an , Homme adversaire, PlateauDeJeu P1) {
		int[] pos = P1.getAnimalByName(an.getName());
		if( pos[1] == posy ) {
				if( pos[0] == posx ) 
						System.out.println("Vous avez rien changés... ");
				else if( posx > pos[0] ) {
						for( int i = pos[0]+1 ; i <= posx ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(i, posy);
								
								if( animalInMyWay.lastIndexOf("r") ==  animalInMyWay.length()-1 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
													if( an.getName().contains("Rat") ) {
														adversaire.removeAnimal(animalInMyWay);
														String animI1 = P1.getAnimalByPosition(i-1, posy);
														if( animI1.contains("Riviére") ) {
															P1.setMat(i-1, posy, "Riviére");
															P1.setMat(i, posy, an.getName());
														} else {
															P1.setMat(i-1, posy, "          ");
															P1.setMat(i, posy, an.getName());
														}
														return -1;
													}
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
														return -1;
													}
													
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
										   } else if ( an.force == lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
										   } else {
											   if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
											   return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == tigre.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == panthere.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == chien.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}				
												return -1;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == loup.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == chat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == rat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(i-1, posy);
													if( animI1.contains("Riviére") ) {
															P1.setMat(i-1, posy, "Riviére");
															P1.setMat(i, posy, an.getName());
													} else {
															P1.setMat(i-1, posy, "          ");
															P1.setMat(i, posy, an.getName());
													}
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
									    }
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(i-1, posy);
									if( animI1.contains("Riviére") ) {
										P1.setMat(i-1, posy, "Riviére");
										P1.setMat(i, posy, an.getName());
									} else {
										P1.setMat(i-1, posy, "          ");
										P1.setMat(i, posy, an.getName());
									}
								} else {
									if( animalInMyWay.contains("Riviére") ) {
										String animI1 = P1.getAnimalByPosition(i-1, posy);
										if( an.getName().contains("Rat") ) {
											if( !animI1.contains("Riviére") ) {
												P1.setMat(i-1, posy, "          ");
												P1.setMat(i, posy, "Riviére " + an.getName());
											} else {
												P1.setMat(i-1, posy, "Riviére");
												P1.setMat(i, posy, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i+3, posy, an.getName());
										} else {
											System.out.println(" Vous pouvez pas deplacer la riviere ");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(i-1, posy, "          ");
										P1.setMat(i, posy, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(i-1, posy, "          ");
										P1.setMat(i, posy, an.getName());
									} else {
										System.out.println(" ####### Déplacer '"+ P1.getAnimalByPosition(i, posy)+"' en avant dabord !! ########### ");
										return 0;
									}
										
								}
						}
				} else {
					for( int i = pos[0]-1 ; i >= posx ; i-- ) {
						String animalInMyWay = P1.getAnimalByPosition(i, posy);
						if( animalInMyWay.lastIndexOf("r") == animalInMyWay.length()-1 ) {
								if(animalInMyWay.contains("Elephant")) {	
									Elephant elephant = new Elephant();
									if ( an.force > elephant.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else if ( an.force == elephant.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( an.getName().contains("Rat") ) {
											adversaire.removeAnimal(animalInMyWay);
											String animI1 = P1.getAnimalByPosition(i+1, posy);
											if( animI1.contains("Riviére") ) {
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
											} else {
												P1.setMat(i+1, posy, "Riviére");
												P1.setMat(i, posy, an.getName());
											}
											return -1;
										}
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
											return -1;
										}
									}
								}
							    if(animalInMyWay.contains("Lion")) {
							    	 Lion lion = new Lion();
							    	 if ( an.force > lion.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
								   } else if ( an.force == lion.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
								   } else {
									   if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
								   }
								}
							    if(animalInMyWay.contains("Tigre")) {
							    	Tigre tigre  = new Tigre();
							    	if ( an.force > tigre.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == tigre.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
							    if(animalInMyWay.contains("Panthere")) {
							    	Panthere panthere = new Panthere();
							    	if ( an.force > panthere.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == panthere.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Chien")) {
									Chien chien = new Chien();
								   	if ( an.force > chien.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == chien.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Loup")) {
									Loup loup = new Loup();
								   	if ( an.force > loup.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == loup.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Chat")) {
									Chat chat = new Chat();
								   	if ( an.force > chat.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == chat.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
						        }
								if(animalInMyWay.contains("Rat")) {	
									Rat rat = new Rat();
								   	if ( an.force > rat.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == rat.force ) {
											adversaire.removeAnimal(animalInMyWay);
											String animI1 = P1.getAnimalByPosition(i+1, posy);
											if( animI1.contains("Riviére") ) {
												P1.setMat(i+1, posy, "Riviére");
												P1.setMat(i, posy, an.getName());
											} else {
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
											}
											
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
							    }
								
						} else if( animalInMyWay.equals("          ") ) {
							String animI1 = P1.getAnimalByPosition(i+1, posy);
							if( animI1.contains("Riviére") ) {
								P1.setMat(i, posy, an.getName());
								P1.setMat(i+1, posy, "Riviére");
							} else {
								P1.setMat(i, posy, an.getName());
								P1.setMat(i+1, posy, "          ");
							}
							
						} else {
							if( animalInMyWay.contains("Riviére") ) {
								String animI1 = P1.getAnimalByPosition(i+1, posy);
								if( an.getName().contains("Rat") ) {
									if(!animI1.contains("Riviére")) {
										P1.setMat(i+1, posy, "          ");
										P1.setMat(i, posy, "Riviére " + an.getName());
									} else {
										P1.setMat(i+1, posy, "Riviére");
										P1.setMat(i, posy, "Riviére " + an.getName());
									}
								} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
									P1.setMat(i+1, posy, "          ");
									P1.setMat(i-3, posy, an.getName());
								} else {
									System.out.println(" Vous pouvez pas deplacer cet animal dans la riviere...  ");
									return 0;
								}
							} else if(animalInMyWay.contains("Piège")) {
								P1.setMat(i+1, posy, "          ");
								P1.setMat(i, posy, an.getName());
								an.setForce(0);
							} else if(animalInMyWay.contains("Sanctuaire")) {
								P1.setMat(i+1, posy, "          ");
								P1.setMat(i, posy, an.getName());
							} else {
								System.out.println(" ####### Déplacer '"+ P1.getAnimalByPosition(i, posy)+"' en avant dabord !! ########### ");
								return 0;
							}	
						}
					}
				}
		} else {
				if( pos[0] == posx ) {
						if ( pos[1] < posy ) {
							// right...
							for(  int i = pos[1]+1 ; i <= posy ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(posx, i);
								if( animalInMyWay.lastIndexOf("r") == animalInMyWay.length()-1 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( an.getName().contains("Rat") ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i-1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i-1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													return -1;
												}
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
													return -1;
												}
												
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
										   } else if ( an.force == lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
										   } else {
											   if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == tigre.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == panthere.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == chien.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == loup.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == chat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == rat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i-1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i-1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
									    }	
										
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(posx, i-1);
									if( animI1.contains("Riviére") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i-1, "Riviére");
									} else {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i-1, "          ");
									}
									
								} else {
									if(animalInMyWay.contains("Riviére")) {
										String name = an.getName(); //Rat
										String animI1 = P1.getAnimalByPosition(posx, i-1);
										if(name.contains("Rat") ) {
											if(!animI1.contains("Riviére")) {
												P1.setMat(posx, i-1, "          ");
												P1.setMat(posx, i, "Riviére " + an.getName());
											} else {
												P1.setMat(posx, i-1, "Riviére");
												P1.setMat(posx, i, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(posx, i-1, "          ");
											P1.setMat(posx, i+2, an.getName());
										} else {
											System.out.println(" Vous pouvez deplacer cet animal dans la riviere... ");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(posx, i-1, "          ");
										P1.setMat(posx, i, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(posx, i-1, "          ");
										P1.setMat(posx, i, an.getName());
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
										return 0;
									}
									
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
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( an.getName().contains("Rat") ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i+1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i+1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													return -1;
												}
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
										   } else if ( an.force == lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
										   } else {
											   if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == tigre.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == panthere.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == chien.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == loup.force ) {												
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
											} else if( an.force == chat.force ) {												
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {						
										   		 adversaire.removeAnimal(animalInMyWay);
												 P1.setMat(posx, i+1, "          ");
												 P1.setMat(posx, i, an.getName());
											} else if( an.force == rat.force ) {	
												adversaire.removeAnimal(animalInMyWay);
												String animI1 = P1.getAnimalByPosition(posx, i+1);
												if( animI1.contains("Riviére") ) {
													P1.setMat(posx, i+1, "Riviére");
													P1.setMat(posx, i, an.getName());
												} else {
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
												}
												
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
									    }	
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(posx, i+1);
									if( animI1.contains("Riviére") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i+1, "Riviére");
									} else {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i+1, "          ");
									}
									
								} else {
									if(animalInMyWay.contains("Riviére")) {
										String name = an.getName(); //Rat
										String animI1 = P1.getAnimalByPosition(posx, i+1);
										if(name.contains("Rat") ) {
											if(!animI1.contains("Riviére")) {
												P1.setMat(posx, i+1, "          ");
												P1.setMat(posx, i, "Riviére " + an.getName());
											} else {
												P1.setMat(posx, i+1, "Riviére");
												P1.setMat(posx, i, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(posx, i+1, "          ");
											P1.setMat(posx, i-2, an.getName());
										} else {
											System.out.println(" vous pouvez pas deplacer l animal dans la riviere ");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(posx, i+1, "          ");
										P1.setMat(posx, i, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(posx, i+1, "          ");
										P1.setMat(posx, i, an.getName());
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
										return 0;
									}
								}
							}
						}
				} else {
						System.out.println("Impossible de se déplacer , il faut choisir de se déplacer selon une seule direction suivant x ou y...");
						return 0;
				}
		}
		return 0;	
    }
	
	
	public int verifieVert ( int posx, int posy, Animal an ,Machine adversaire, PlateauDeJeu P1) {
		int[] pos = P1.getAnimalByName(an.getName());
		if( pos[1] == posy ) {
				if( pos[0] == posx ) 
						System.out.println("Vous changer rien... ");
				else if( posx > pos[0] ) {
						for( int i = pos[0]+1 ; i <= posx ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(i, posy);
								
								if( animalInMyWay.lastIndexOf("v") ==  animalInMyWay.length()-1 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( an.getName().contains("Rat") ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(i-1, posy);
													if( animI1.contains("Riviére") ) {
														P1.setMat(i-1, posy, "Riviére");
														P1.setMat(i, posy, an.getName());
													} else {
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
													}
													return -1;
												}
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
													return -1;
												}
												
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
										   } else if ( an.force == lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
										   } else {
											   if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
											   return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   
											} else if( an.force == tigre.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
									    		   
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   
											} else if( an.force == panthere.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
											} else {
													if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
														P1.setMat(i-2, posy, an.getName());
														P1.setMat(i-1, posy, "          ");
													}
													return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
										   		
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												   
											} else if( an.force == chien.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;										
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
										   		   
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
												  
											} else if( an.force == loup.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == chat.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i-1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(i-1, posy, "          ");
												   P1.setMat(i, posy, an.getName());
											} else if( an.force == rat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(i-1, posy);
													if( animI1.contains("Riviére") ) {
														P1.setMat(i-1, posy, "Riviére");
														P1.setMat(i, posy, an.getName());
													} else {
														P1.setMat(i-1, posy, "          ");
														P1.setMat(i, posy, an.getName());
													}
											} else {
												if( P1.getAnimalByPosition(i-2, posy) .equals("          ") ) {
													P1.setMat(i-2, posy, an.getName());
													P1.setMat(i-1, posy, "          ");
												}
												return -1;
											}
									    }	
										
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(i-1, posy);
									if( animI1.contains("Riviére") ) {
										P1.setMat(i, posy, an.getName());
										P1.setMat(i-1, posy, "Riviére");
									} else {
										P1.setMat(i, posy, an.getName());
										P1.setMat(i-1, posy, "          ");
									}
									
								} else {
									if(animalInMyWay.contains("Riviére")) {
										String animI1 = P1.getAnimalByPosition(i-1, posy);
										if( an.getName().contains("Rat") ) {
											if( !animI1.contains("Riviére") ) {
												P1.setMat(i-1, posy, "          ");
												P1.setMat(i, posy, "Riviére " + an.getName());
											} else {
												P1.setMat(i-1, posy, "Riviére");
												P1.setMat(i, posy, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(i-1, posy, "          ");
											P1.setMat(i+3, posy, an.getName());
										} else {
											System.out.println(" vous pouvez pas deplacer l animal dans cette riviere ");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(i-1, posy, "          ");
										P1.setMat(i, posy, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(i-1, posy, "          ");
										P1.setMat(i, posy, an.getName());
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
										return 0;
									}
								}
						}
				} else {
					for( int i = pos[0]-1 ; i >= posx ; i-- ) {
						String animalInMyWay = P1.getAnimalByPosition(i, posy);
						if( animalInMyWay.lastIndexOf("v") ==  animalInMyWay.length()-1 ) {
								if(animalInMyWay.contains("Elephant")) {	
									Elephant elephant = new Elephant();
									if ( an.force > elephant.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else if ( an.force == elephant.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( an.getName().contains("Rat") ) {
											adversaire.removeAnimal(animalInMyWay);
											String animI1 = P1.getAnimalByPosition(i+1, posy);
											if( animI1.contains("Riviére") ) {
												P1.setMat(i+1, posy, "Riviére");
												P1.setMat(i, posy, an.getName());
											} else {
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
											}
											return -1;
										}
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
											return -1;
										}
									}
								}
							    if(animalInMyWay.contains("Lion")) {
							    	 Lion lion = new Lion();
							    	 if ( an.force > lion.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
								   } else if ( an.force == lion.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
								   } else {
									   if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
									   return -1;
								   }
								}
							    if(animalInMyWay.contains("Tigre")) {
							    	Tigre tigre  = new Tigre();
							    	if ( an.force > tigre.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == tigre.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
							    if(animalInMyWay.contains("Panthere")) {
							    	Panthere panthere = new Panthere();
							    	if ( an.force > panthere.force ) {
							    		  
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   
									} else if( an.force == panthere.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Chien")) {
									Chien chien = new Chien();
								   	if ( an.force > chien.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == chien.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Loup")) {
									Loup loup = new Loup();
								   	if ( an.force > loup.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										  
									} else if( an.force == loup.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
								}
								if(animalInMyWay.contains("Chat")) {
									Chat chat = new Chat();
								   	if ( an.force > chat.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
										   
									} else if( an.force == chat.force ) {
											adversaire.removeAnimal(animalInMyWay);
											P1.setMat(i+1, posy, "          ");
											P1.setMat(i, posy, an.getName());
											
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
						        }
								if(animalInMyWay.contains("Rat")) {	
									Rat rat = new Rat();
								   	if ( an.force > rat.force ) {
										   adversaire.removeAnimal(animalInMyWay);
										   P1.setMat(i+1, posy, "          ");
										   P1.setMat(i, posy, an.getName());
									} else if( an.force == rat.force ) {
											adversaire.removeAnimal(animalInMyWay);
											String animI1 = P1.getAnimalByPosition(i+1, posy);
											if( animI1.contains("Riviére") ) {
												P1.setMat(i+1, posy, "Riviére");
												P1.setMat(i, posy, an.getName());
											} else {
												P1.setMat(i+1, posy, "          ");
												P1.setMat(i, posy, an.getName());
											}
									} else {
										if( P1.getAnimalByPosition(i+2, posy) .equals("          ") ) {
											P1.setMat(i+2, posy, an.getName());
											P1.setMat(i+1, posy, "          ");
										}
										return -1;
									}
							    }	
								
						} else if( animalInMyWay.equals("          ") ) {
							String animI1 = P1.getAnimalByPosition(i+1, posy);
							if( animI1.contains("Riviére") ) {
								P1.setMat(i, posy, an.getName());
								P1.setMat(i+1, posy, "Riviére");
							} else {
								P1.setMat(i, posy, an.getName());
								P1.setMat(i+1, posy, "          ");
							}
						} else {
							if(animalInMyWay.contains("Riviére")) {
								String name = an.getName(); //Rat
								String animI1 = P1.getAnimalByPosition(i+1, posy);
								if(name.contains("Rat") ) {
									if(!animI1.contains("Riviére")) {
										P1.setMat(i+1, posy, "          ");
										P1.setMat(i, posy, "Riviére " + an.getName());
									} else {
										P1.setMat(i+1, posy, "Riviére");
										P1.setMat(i, posy, "Riviére " + an.getName());
									}
								} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
									P1.setMat(i+1, posy, "          ");
									P1.setMat(i-3, posy, an.getName());
								} else {
									System.out.println(" vous pouvez pas deplacer l animal dans cette riviere ");
									return 0;
								}
							} else if(animalInMyWay.contains("Piège")) {
								P1.setMat(i+1, posy, "          ");
								P1.setMat(i, posy, an.getName());
								an.setForce(0);
							} else if(animalInMyWay.contains("Sanctuaire")) {
								P1.setMat(i+1, posy, "          ");
								P1.setMat(i, posy, an.getName());
							} else {
								System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(i, posy)+" en avant dabord !! ########### ");
								return 0;
							}
						}
					}
				}
		} else {
				if( pos[0] == posx ) {
						if ( pos[1] > posy ) {
							// right...
							for( int i = pos[1]-1 ; i >= posy ; i-- ) {
								String animalInMyWay = P1.getAnimalByPosition(posx, i);
								if( animalInMyWay.lastIndexOf("v") ==  animalInMyWay.length()-1 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i+1, posy, "          ");
													P1.setMat(i, posy, an.getName());
											} else {
												if( an.getName().contains("Rat") ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i+1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i+1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													return -1;
												}
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
													return -1;
												}
												
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
									    		    
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
										   } else if ( an.force == lion.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(i+1, posy, "          ");
													P1.setMat(i, posy, an.getName());
													
										   } else {
											   if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
											   return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
									    		   
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == tigre.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
									    		  
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												   
											} else if( an.force == panthere.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
										   	
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												   
											} else if( an.force == chien.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
										   		  
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												   
											} else if( an.force == loup.force ) {
												
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
										   		  
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == chat.force ) {
													
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i+1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
										   		 
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i+1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == rat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i+1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i+1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i+1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													
											} else {
												if( P1.getAnimalByPosition(posx, i+2) .equals("          ") ) {
													P1.setMat(posx, i+2, an.getName());
													P1.setMat(posx, i+1, "          ");
												}
												return -1;
											}
									    }	
										
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(posx, i+1);
									if( animI1.contains("Riviére") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i+1, "Riviére");
									} else {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i+1, "          ");
									}
									
								} else {
									if(animalInMyWay.contains("Riviére")) {
										String name = an.getName(); //Rat
										String animI1 = P1.getAnimalByPosition(posx, i+1);
										if(name.contains("Rat") ) {
											if( !animI1.contains("Riviére") ) {
												P1.setMat(posx, i+1, "          ");
												P1.setMat(posx, i, "Riviére " + an.getName());
											} else {
												P1.setMat(posx, i+1, "Riviére");
												P1.setMat(posx, i, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(posx, i+1, "          ");
											P1.setMat(posx, i-2, an.getName());
										} else {
											System.out.println(" vous pouvez pas deplacer cet animal dans la riviere..");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(posx, i+1, "          ");
										P1.setMat(posx, i, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(posx, i+1, "          ");
										P1.setMat(posx, i, an.getName());
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
										return 0;
									}
								}
							
							}
						} else {
							// left...
							for( int i = pos[1]+1 ; i <= posy ; i++ ) {
								String animalInMyWay = P1.getAnimalByPosition(posx, i);
								if( animalInMyWay.lastIndexOf("v") ==  animalInMyWay.length()-1 ) {
										if(animalInMyWay.contains("Elephant")) {	
											Elephant elephant = new Elephant();
											if ( an.force > elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else if ( an.force == elephant.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( an.getName().contains("Rat") ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i-1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i-1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													return -1;
												}
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
													return -1;	
												}
												
											}
										}
									    if(animalInMyWay.contains("Lion")) {
									    	 Lion lion = new Lion();
									    	 if ( an.force > lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
										   } else if ( an.force == lion.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
										   } else {
											   if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
											   return -1;
										   }
										}
									    if(animalInMyWay.contains("Tigre")) {
									    	Tigre tigre  = new Tigre();
									    	if ( an.force > tigre.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												   
											} else if( an.force == tigre.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
									    if(animalInMyWay.contains("Panthere")) {
									    	Panthere panthere = new Panthere();
									    	if ( an.force > panthere.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == panthere.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chien")) {
											Chien chien = new Chien();
										   	if ( an.force > chien.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == chien.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Loup")) {
											Loup loup = new Loup();
										   	if ( an.force > loup.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == loup.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
										}
										if(animalInMyWay.contains("Chat")) {
											Chat chat = new Chat();
										   	if ( an.force > chat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == chat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													P1.setMat(posx, i-1, "          ");
													P1.setMat(posx, i, an.getName());
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
								        }
										if(animalInMyWay.contains("Rat")) {	
											Rat rat = new Rat();
										   	if ( an.force > rat.force ) {
												   adversaire.removeAnimal(animalInMyWay);
												   P1.setMat(posx, i-1, "          ");
												   P1.setMat(posx, i, an.getName());
												  
											} else if( an.force == rat.force ) {
													adversaire.removeAnimal(animalInMyWay);
													String animI1 = P1.getAnimalByPosition(posx, i-1);
													if( animI1.contains("Riviére") ) {
														P1.setMat(posx, i-1, "Riviére");
														P1.setMat(posx, i, an.getName());
													} else {
														P1.setMat(posx, i-1, "          ");
														P1.setMat(posx, i, an.getName());
													}
													
											} else {
												if( P1.getAnimalByPosition(posx, i-2) .equals("          ") ) {
													P1.setMat(posx, i-2, an.getName());
													P1.setMat(posx, i-1, "          ");
												}
												return -1;
											}
									    }	
										
								} else if( animalInMyWay.equals("          ") ) {
									String animI1 = P1.getAnimalByPosition(posx, i-1);
									if( animI1.contains("Riviére") ) {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i-1, "Riviére");
									} else {
										P1.setMat(posx, i, an.getName());
										P1.setMat(posx, i-1, "          ");
									}
									
								} else {
									if(animalInMyWay.contains("Riviére")) {
										String name = an.getName();
										String animI1 = P1.getAnimalByPosition(posx, i-1);
										if(name.contains("Rat") ) {
											if(!animI1.contains("Riviére")) {
												P1.setMat(posx, i-1, "          ");
												P1.setMat(posx, i, "Riviére " + an.getName());
											} else {
												P1.setMat(posx, i-1, "Riviére");
												P1.setMat(posx, i-1, "Riviére " + an.getName());
											}
										} else if( an.getName().contains("Lion") || an.getName().contains("Panthere") ) {
											P1.setMat(posx, i-1, "          ");
											P1.setMat(posx, i+2, an.getName());
										} else {
											System.out.println(" vous pouvez pas deplacer cet animal dans la riviere.. ");
											return 0;
										}
									} else if(animalInMyWay.contains("Piège")) {
										P1.setMat(posx, i-1, "          ");
										P1.setMat(posx, i, an.getName());
										an.setForce(0);
									} else if(animalInMyWay.contains("Sanctuaire")) {
										P1.setMat(posx, i-1, "          ");
										P1.setMat(posx, i, an.getName());
									} else {
										System.out.println(" ####### Déplacer"+ P1.getAnimalByPosition(posx, i)+" en avant dabord !! ########### ");
										return 0;
									}
								}
							
							}

						}
				} else {
						System.out.println("Impossible de se déplacer , il faut choisir de se déplacer selon une seule direction suivant x ou y...");
						return 0;
				}
		}
		return 0;
		
     }


}
