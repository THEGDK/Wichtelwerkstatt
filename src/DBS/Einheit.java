package DBS;

public abstract class Einheit implements Comparable<Einheit>{

	protected int lebenspunkte = 20; 
	protected int initiative = (int)(Math.random()*101);

	/**
	 * Lebt die Einheit noch?
	 * @return
	 */
	public boolean lebtNoch() {
		return lebenspunkte > 0;
	}

	public void attackiere(Einheit ziel){
		
	}
	
	public boolean kannAngreifen(Einheit ziel){
		return false;
	}
	
	public void werdeAngegriffen(int schaden){
		lebenspunkte -= schaden;
	}

}
