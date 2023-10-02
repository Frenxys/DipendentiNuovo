import java.util.LinkedList;

public class Dipendenti {
	
	private LinkedList<Dipendente> lista;
	
	public Dipendenti() {
		lista=new LinkedList<Dipendente>();
	}
	public void addDipendente(Dipendente d) {
		lista.add(d);
	}
	public void eliminaDipendente(String nominativo) {
		
		for(Dipendente d:lista) {
			if(d.getNominativo().equals(nominativo)) {
				lista.remove(d);
				break;
			}
		}
		
	}
	public void ricercaDipendente(String nominativo) {
		
		for(Dipendente d:lista) {
			if(d.getNominativo().equals(nominativo)) {
				System.out.println(d);
			}
		}
	}
	public void restituisciDocenti() {
		int docenti=0;
		for(Dipendente d:lista) {
			if(d instanceof Docente) {
				docenti++;
			}
		}
		System.out.println("i docenti sono:"+docenti);
	}
	public void stampaDipendenti() {
		System.out.println("Dipendenti:");
		for(Dipendente d:lista) {
			System.out.println(d);
		}
		
	}

}
