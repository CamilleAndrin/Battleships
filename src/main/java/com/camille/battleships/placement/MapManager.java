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
				
		public void PlacementBateaux(Bateaux Boats,Joueur Joueurs) {
			int x;
			int y;
			
			for(int i = 0; i < Joueurs.getShipsArray().size(); i++) {
				do{
					x = (int)(Math.random() * 18);
					y = (int)(Math.random() * 24);
					Boats.getMaCase().add(new Case());
					int j = (int)Math.random()*2;
					if (j == 0) {
						for (int b = 0; b < ships.getL()-1; b++) {
							y = y+1;
							Boats.getMaCase().add(new Case());}
					}else {
						for (int b = 0; b < ships.getL()-1; b++) {
							x = x+1;
							Boats.getMaCase().add(new Case());}
							}
					} while ( x > 24 || y > 18);
			}	
		}	
		public void MapMaker(Bateaux Boats, Joueur joueurs) {
			
			for(int jou = 0; jou < 2; jou++) {
				for(int l = 0; l < 24; l++) {
					for(int h =0; h < 18; h++) {
						for(Boats.getMaCase().get(id); Boats.getMaCase(id) < Boats.getMaCase().size(); Boats.getMaCase().increment(1)) {
							if (l == Boats.getMaCase().get(x) && h == Boats.getMaCase().get(y) ){
								System.out.println(" X");
							}else {
								System.out.println(" ()");
							}
					}
					}
				}
			}
				
			
		}
}
