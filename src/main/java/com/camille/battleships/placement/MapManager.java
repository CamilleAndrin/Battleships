package com.camille.battleships.placement;

import java.util.ArrayList;

import com.camille.battleships.entities.bateaux.Bateaux;
import com.camille.battleships.entities.bateaux.Corvette;
import com.camille.battleships.entities.bateaux.Croiseur;
import com.camille.battleships.entities.bateaux.Destroyer;
import com.camille.battleships.entities.bateaux.PorteAvion;
import com.camille.battleships.entities.joueurs.Joueur;
import com.camille.battleships.entities.maps.Case;


public class MapManager {

	private int tailleX = 24;
	private int tailleY = 18;
	
	private Bateaux ships;
	
	public MapManager (Bateaux ships) {
	super();
	this.ships = ships;}
 	
		public void TakeABoat(Joueur joueur){
			joueur.getShipsArray().add(new Corvette());
			joueur.getShipsArray().add(new Croiseur());
			joueur.getShipsArray().add(new Croiseur());
			joueur.getShipsArray().add(new Destroyer());
			joueur.getShipsArray().add(new Destroyer());
			joueur.getShipsArray().add(new PorteAvion()); 
		}
				
		public ArrayList<Case> PlacementBateaux(Bateaux Boats,Joueur Joueurs) {
			
				for(int i = 0; i < this.tailleY ; i++){			
					for(int j = 0; j < this.tailleX ; j++){
						
					}
				}		
		
		
		
		
		
		
		return result;
	}
}
