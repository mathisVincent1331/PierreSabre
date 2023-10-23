package histoire;
import personnages.Humain;

public class Histoire4 {

	public static void main(String[] args) {
		Humain ninja = new Humain("naruto","kombucha",54);
		ninja.direBonjour();
		ninja.acheter("boisson", 12);
		ninja.boire();
		ninja.acheter("jeu", 2);
		ninja.acheter("kimono", 50);
	}

}
