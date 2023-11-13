package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int traitrise = 0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "
				+traitrise + ". Chut !");
	}
	
	
	public void ranconner(Commercant commercant) {
		if (traitrise < 3) {
			int comercantArgent = commercant.getArgent();
			int argentRanconner = (comercantArgent*2/10);
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			traitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !"
					+" Donne-moi "+argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+getNom()+"!");
		} else {
			parler("Mince je ne peux rançonner personne sinon un"+
				"samourai risque de me démasquer!");
		}
	}
	
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne "
					+"car je ne connais personne ! Snif.");
		} else {
			Random random = new Random();
			Humain perso = memoire[random.nextInt(nbConnaissance)];
			int don = (argent*1/20);
			String nomAmi = perso.getNom();
			
			parler("Il faut absolument remonter ma côte de confiance."
					+" Je vais faire ami ami avec " 
					+nomAmi+".");
			parler("Bonjour l'ami! "
					+"Je voudrais vous aider en vous donnant "
					+don+" sous.");
			perso.gagnerArgent(don);
			perdreArgent(don);
			perso.parler("Merci "+ this.getNom()+". Vous êtes quelqu'un de bien.");
			
			if(traitrise >= 1) {
				traitrise --;
			}
		}
	}
}
