package ds2020exercice2;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String r;
	protected String pays;
	protected int d;
	private int nbplace;
	public Film(String titre, String r, String pays, int d) {
		this.titre = titre;
		this.r =r;
		this.pays = pays;
		this.d = d;
	}
	public int getNbplace() {
		return nbplace;
	}
	public void setNbplace(int nbplace) {
		this.nbplace = nbplace;
	}
	public float totalVenteBillets () {
		int nbet;
		Scanner s=new Scanner(System.in);
		do {
			
			System.out.println("donner le nbre des places des etudiants");
			nbet=s.nextInt();
		}while(nbplace<=nbet);
		
		return (nbplace-nbet)*3 + nbet*2 ;
	}
	public String toString () {
		return "titre: "+titre+"realisateut "+r+"pays "+pays;
		
	}
	 
}
