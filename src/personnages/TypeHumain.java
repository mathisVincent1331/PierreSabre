package personnages;

public enum TypeHumain {
	RONIN("Ronin"), SAMOURAI("Samourai"),
	HABITANT("Habitant"), YAKUZA("Yakuza"),
	COMMERCANT("Commercant");
		
	private String nom;
		
	private TypeHumain(String nom) {
		this.nom = nom;
	}
		
	@Override
	public String toString() {
		return nom;
	}
}
