package DBS;

public class Ork extends Einheit implements Krieger, SchwereRuestung{

	@Override
	public boolean kannAngreifen(Einheit s) {
		if (s instanceof Mensch || s instanceof Zwerg || s instanceof Schaf) return true;
		return false;
	}

	@Override
	String WhoAmI() {
		return "Ork";
	}

}
