package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		String nomVictime = victime.getNom();

		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(nomVictime + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.seFaireExtorquer();
		gagnerArgent(argentVictime);
		parler("J’ai piqué les " + argentVictime + " sous de " + nomVictime + ", ce qui me fait " + argent
				+ " sous dans mapoche. Hi ! Hi !");
	}

	public int perdre() {
		reputation --;
		parler(" J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + "...");
		int perte = argent;
		argent = 0;
		return perte;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous");
	}
}
