package ds2020exercice2;

public class Jcc {
	private Film []competition;
	private int annee;
	private  int NBFMAX=30;
	private int nbf=0;
	public Jcc( int annee, int nBFMAX) {
		this.annee = annee;
		NBFMAX = nBFMAX;
		competition=new Film[NBFMAX ];
	}
	public void ajoutFilm(Film F) {
		if(nbf<NBFMAX) {
			competition[nbf]=F;
			nbf++;
		}
		else {
			System.out.println("La competition est au complet");
		}
	}
	public void listeFilmsJCC () {
		for(int i=0;i<nbf;i++) {
				System.out.println(competition[i]);
		}
	}
	public float  totalVenteBilletsJCC () {
		float mon=0;
		for(int i=0;i<nbf;i++) {
			mon=mon+competition[i].totalVenteBillets();
		}
		return mon;
	}
	public static void main (String []args) {
		Jcc festival=new Jcc(2020,30);
		Film F=new Film("Insurrection","Jilani Saadi","Tunisie",105);
		F.setNbplace(45);
		Film D=new Documentaire("Le dernier refuge  ","Ousman","Mali",86,"La guerre civile");
		D.setNbplace(30);
		festival.ajoutFilm(F);
		festival.ajoutFilm(D);
		festival.listeFilmsJCC();
		System.out.println(festival.totalVenteBilletsJCC());
	}
	
	
	
	
	
	
	
}
