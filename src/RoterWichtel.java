
public class RoterWichtel extends Wichtel{

	public RoterWichtel() {
		super();
	}

	public RoterWichtel(String name) {
		super(name);
	}
	
	public void arbeite(Geschenk g){
		if (g instanceof Spielzeug)
			setDauer((int)g.schwierigkeit()); //TODO: Double zu int cast, möglicherweise ein Fehler...
		else
			setDauer((int)g.schwierigkeit - 2);
	}
	
	public String toString(){
		return "Roter Wichtel "  + this.getName();
	}
	
}
