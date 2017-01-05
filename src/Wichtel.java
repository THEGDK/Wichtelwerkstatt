
public class Wichtel {

	private String name;
	private int gearbeiteteZeit;
	private int geschenkeGefertigt;
	private int dauer;
	

	public Wichtel(){
		this.name = Zufall.koboldname();
	}
	
	public Wichtel(String name){
		this.name = name;
	}


	public int getGeschenkeGefertigt() {
		return geschenkeGefertigt;
	}


	public void setGeschenkeGefertigt(int geschenkeGefertigt) {
		this.geschenkeGefertigt = geschenkeGefertigt;
	}


	public int getGearbeiteteZeit() {
		return gearbeiteteZeit;
	}


	public void setGearbeiteteZeit(int gearbeiteteZeit) {
		this.gearbeiteteZeit = gearbeiteteZeit;
	}


	public int getDauer() {
		return dauer;
	}


	public void setDauer(int dauer) {
		this.dauer = dauer;
	}


	public String getName() {
		return name;
	}
	
	public String toString(){
		return name;
	}

	public boolean arbeitetNoch() {
		return dauer != 0;
	}

	public void arbeiteWeiter() {
		// TODO Auto-generated method stub
		dauer--; //TODO fertig
	}

	public void arbeite(Geschenk g) {
		// TODO Auto-generated method stub
		
	}

	public int effizienz() {
		// TODO Auto-generated method stub
		return 0;
	}
}
