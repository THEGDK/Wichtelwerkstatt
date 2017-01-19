package DBS;

public class Schaf extends Einheit {
	@Override
	public void werdeAngegriffen(int schaden) {
		try {
			super.werdeAngegriffen(schaden);
			if (lebtNoch()) throw new SchafException("Ein Schaf versucht zu fliehen!");
			else throw new SchafException("Ein Schaf fiel den Horden zum Opfer!");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	String WhoAmI() {
		return "Schaf";
	}

}
