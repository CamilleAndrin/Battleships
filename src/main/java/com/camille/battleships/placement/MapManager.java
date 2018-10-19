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
		
			for(int i = 0; i < Joueurs.getShipsArray().size(); i++) {
				int x = (int)(Math.random() * 18);
				int y = (int)(Math.random() * 24);
				int id = i;
				Boats.getMaCase().add(new Case());
				int j = (int)Math.random()*2;
				if (j == 0) {
					for (int b = 0; b < ships.getL()-1; b++) {
						Boats.getMaCase().add(new Case());}
				}else {
					for (int b = 0; b < ships.getL()-1; b++) {
						Boats.getMaCase().add(new Case());} 
				}
			}
			return ;
		}
}
