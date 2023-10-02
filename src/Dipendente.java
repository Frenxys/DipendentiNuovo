
abstract public class Dipendente {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "[nominativo=" + nominativo + ", genere=" + genere + ", indirizzo=" + indirizzo + "]";
	}
	private String nominativo;
	private char genere;
	private String indirizzo;
	public Dipendente() {
		
	}
	public Dipendente(String nominativo,char genere,String indirizzo) {
		setNominativo(nominativo);
		setGenere(genere);
		setIndirizzo(indirizzo);
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public char getGenere() {
		return genere;
	}
	public void setGenere(char genere) {
		this.genere = genere;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	

}
