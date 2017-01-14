package DBS;

public class Zwerg extends Einheit implements Krieger, SchwereRuestung, Fernkampf {

	@Override
	public boolean kannAngreifen(Einheit s) {
		if (s instanceof Ork || s instanceof Goblin || s instanceof Schaf) return true;
		return false;
	}

	@Override
	public int compareTo(Einheit o) {
		return initiative-o.initiative;
	}

}
