
public class Impiegato extends Dipendente{
	private String ufficio;

	public Impiegato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Impiegato(String nominativo, char genere, String indirizzo,String ufficio) {
		super(nominativo, genere, indirizzo);
		setUfficio(ufficio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Impiegato [ufficio=" + ufficio + "," + super.toString() + "]";
	}

	public String getUfficio() {
		return ufficio;
	}

	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}
	
}
