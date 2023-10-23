package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	
	public void donner(Commercant beneficiaire) {
		int don = (10 * argent)/100;
		perdreArgent(don);
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n"
				+ "marchand!");
		
		if((honneur*2) >= adversaire.getReputation()){
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur ++;
		} else {
			honneur --;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			perdreArgent(argent);
		}
	}
}
