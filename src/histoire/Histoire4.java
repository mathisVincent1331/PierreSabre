package histoire;
import personnages.*;

public class Histoire4 {

	public static void main(String[] args) {
		Humain ninja = new Humain("naruto","kombucha", 54);
//		ninja.direBonjour();
//		ninja.acheter("boisson", 12);
//		ninja.boire();
//		ninja.acheter("jeu", 2);
//		ninja.acheter("kimono", 50);
		
		
		Commercant marco = new Commercant("Marco", 20);
//		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
//		marco.boire();
		
		Yakuza mikey = new Yakuza("Yaku le Noir", "whiskey", 30, "Warsong");
		mikey.direBonjour();
		mikey.extorquer(marco);
	}

}
