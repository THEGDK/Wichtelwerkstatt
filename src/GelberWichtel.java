
public class GelberWichtel extends Wichtel{
	
	public GelberWichtel(){
		super();
	}
	
	public GelberWichtel(String name){
		super(name);
	}
	
	public void arbeite(Geschenk g){
		setGeschenkeGefertigt(getGeschenkeGefertigt() + 1);
		if (g instanceof Kleidung){
			setDauer(getDauer()+2);
		} else {
			setDauer(getDauer()+1);
		}
	}

	public String toString(){
		return "Gelber Wichtel "  + this.getName();
	}
	
}
