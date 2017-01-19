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

	public void attackiere(Einheit ziel) {
		System.out.println(this.toString() + " greift " + ziel.toString() + " an.");
		int damage = 2; //Normaler Schaden
		if (this instanceof Fernkampf) damage += 2;        //Fernkampf fügt zwei Schadenspunkte hinzu...
		if (ziel instanceof SchwereRuestung) damage /= 2;    //wird aber durch SchwereRuestung beeinträchtigt,
		if (this instanceof Gift) damage += 2;                //was für Gift aber nciht gilt.

		ziel.werdeAngegriffen(damage);
	}
	
	public boolean kannAngreifen(Einheit ziel){
		return false;
	}
	
	public void werdeAngegriffen(int schaden){
		lebenspunkte -= schaden;
	}

	@Override
	public int compareTo(Einheit o) {
		return initiative - o.initiative;
	}

	public String toString() {
		return WhoAmI() + "(" + lebenspunkte + ")";
	}

	abstract String WhoAmI();
}
