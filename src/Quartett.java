public class Quartett {
	private Musiker[] besetzung = new Musiker[4];
	private int next = 0;
	
	public static void main(String[] args) {
		Quartett q = new Quartett();
		q.engagiere("Heinz");
		q.engagiere("Gustav");
		q.engagiere("Balduin");
		q.engagiere("Nepumuk");
		q.engagiere("Ralf");
	}
	
	private void engagiere(String name) {
		try {
			Musiker m = Musiker.erstelleMusiker(name);
			System.out.println(m + " spielt nun im Quartett!");
			besetzung[next] = m;
			next++;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}