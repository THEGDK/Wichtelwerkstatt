package DBS;

public class Goblin extends Einheit implements Krieger, Gift, Fernkampf{

	@Override
	public boolean kannAngreifen(Einheit s) {
		if (s instanceof Mensch || s instanceof Zwerg || s instanceof Schaf) return true;
		return false;
	}

	@Override
	public void attackiere(Einheit ziel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Einheit o) {
		return initiative-o.initiative;
	}

}
