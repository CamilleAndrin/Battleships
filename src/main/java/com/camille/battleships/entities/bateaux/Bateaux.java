package com.camille.battleships.entities.bateaux;

import java.util.ArrayList;

import com.camille.battleships.entities.maps.Case;

public abstract class Bateaux {
	
	private int N;
	private int L;
	private int id;
	private ArrayList<Case> maCase = new ArrayList<Case>();
			
	public int getN() {
		return N;
	}
	public int getL() {
		return L;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Case> getShipsArray() {
		return maCase;
	}
	
	public Bateaux(int L, int N, int id){
		this.L=L;
		this.N=N;
		this.id=id;
		this.maCase = maCase;
	}
}


