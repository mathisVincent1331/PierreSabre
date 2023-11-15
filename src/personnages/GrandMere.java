package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	private final int capaciteMemoire = 5;
	private Humain[] memoire = new Humain[capaciteMemoire];
	private int nbConnaissance = 0;
	private TypeHumain[] types = TypeHumain.values();
	
	public GrandMere(String nom, int argent) {
		super(nom,"tisane",argent);
	}
	
	@Override
	protected void memoriser(Humain nouvelHumain) {
		if (nbConnaissance == capaciteMemoire){
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une "
					+ "personne supplémentaire !");
		} else {
			memoire[nbConnaissance] = nouvelHumain;
			nbConnaissance ++;
		}
	}
	
	private TypeHumain humainHasard() {
		Random random = new Random();
		int indice = random.nextInt(types.length);
		return types[indice];
		
	}
	
	public static void main(String[] args) {
		GrandMere mamy = new GrandMere("Joyce", 60);
		mamy.humainHasard();
	}
	
	public void ragoter(){
		for(int i=0; i<nbConnaissance;i++){
			if (memoire[i] instanceof Traitre){
				parler("Je sais que "
						+ memoire[i].getNom()+" est un traître. Petit chenapan !");
			} else {
				parler("Je crois que "
						+memoire[i].getNom()+" est un "+humainHasard());
			}
		}
	}
}

