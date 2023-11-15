package personnages;


public class Humain {
	private final int personneMemoire = 30;
	private String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[personneMemoire];
		
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	
	protected void direBonjour() {
		parler("Bonjour ! Je m'appelle "
				+ nom + " et j'aime boire du "
				+ boisson+".");
	}
	
	public void boire() {
		parler(" Mmmmm, un bon verre de "
				+ boisson +" ! GLOUPS !");
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
		
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "
					+bien+" à "+prix+" sous !");
			argent -= prix;
		} else {
			parler("Je n'ai plus que "
					+argent+" sous en poche. Je ne peux même pas m'offrir un "
					+bien+" à "+prix+" sous.");
		}
	}
	
	protected void gagnerArgent(int gain){
		argent += gain;
	}
	
	protected void perdreArgent(int perte){
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	protected void memoriser(Humain humain) {
		if (nbConnaissance == personneMemoire) {
			for(int i=1; i<nbConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance-1] = humain;
		} else {
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		}	
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		String connaitre = "Je connais beaucoup de monde dont : ";
		for(int i=0; i<nbConnaissance;i++){
			connaitre +=  memoire[i].getNom();
			if ((i+1) != nbConnaissance){
				connaitre += ", ";
			}
		}
		parler(connaitre);
	}
}

