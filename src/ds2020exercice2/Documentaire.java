package ds2020exercice2;

import java.util.Scanner;

public class Documentaire extends Film  {
	private String sujet;
	private static float tarif=2;
	public Documentaire(String titre, String r, String pays, int d, String sujet) {
		super(titre, r, pays, d);
		this.sujet = sujet;
	}
	public String toString () {
		return super.toString()+ " sujet: "+sujet;
		
	}
	public int getNbplace() {
		return super.getNbplace();
	} 

	public float totalVenteBillets () {
	
		return   getNbplace()*tarif ;
	}

	
	
	
	

}
