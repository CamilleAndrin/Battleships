package com.camille.battleships.entities.bateaux;

public abstract class Bateaux {
	
	private int N;
	private int L;
	private int id;
			
	public int getN() {
		return N;
	}
	public int getL() {
		return L;
	}
	public int getId() {
		return id;
	}
	public Bateaux(int L, int N, int id){
		this.L=L;
		this.N=N;
		this.id=id;
	}
}


