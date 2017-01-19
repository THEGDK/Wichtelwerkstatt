package DBS;

public class Mensch extends Einheit implements Krieger, SchwereRuestung, Fernkampf{

	@Override
	public boolean kannAngreifen(Einheit s) {
		if (s instanceof Ork || s instanceof Goblin || s instanceof Schaf) return true;
		return false;
	}

	@Override
	String WhoAmI() {
		return "Mensch";
	}
}
