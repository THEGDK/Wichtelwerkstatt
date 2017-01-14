package DBS;

public class Schaf extends Einheit {

	@Override
	public void attackiere(Einheit ziel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Einheit o) {
		return initiative-o.initiative;
	}


}
