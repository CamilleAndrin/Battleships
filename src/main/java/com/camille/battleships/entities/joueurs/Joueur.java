package com.camille.battleships.entities.joueurs;

import java.util.ArrayList;

import com.camille.battleships.entities.bateaux.Bateaux;

public class Joueur {

	private ArrayList<Bateaux> shipsArray = new ArrayList<Bateaux>();
	
	public ArrayList<Bateaux> getShipsArray() {
		return shipsArray;
	}

	public void setShipsArray(ArrayList<Bateaux> shipsArray) {
		this.shipsArray = shipsArray;
	}

	public Joueur (ArrayList<Bateaux> ships) {
	super();
	this.shipsArray = ships;
}
 		 
}