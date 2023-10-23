package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		String nomVictime = victime.getNom();
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(nomVictime
				+", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.seFaireExtorquer();
		argent += argentVictime;
		parler("J’ai piqué les "+argentVictime+" sous de "
				+nomVictime+", ce qui me fait "
				+argent+" sous dans mapoche. Hi ! Hi !");
	}
}
