package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		parler("J’ai tout perdu ! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int somme) {
		gagnerArgent(somme);
		parler(somme+" sous ! Je vous remercie généreux donateur !");
	}
}
