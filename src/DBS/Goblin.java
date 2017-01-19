package DBS;

public class Goblin extends Einheit implements Krieger, Gift, Fernkampf{

	@Override
	public boolean kannAngreifen(Einheit s) {
		if (s instanceof Mensch || s instanceof Zwerg || s instanceof Schaf) return true;
		return false;
	}

	@Override
	String WhoAmI() {
		return "Goblin";
	}

}
