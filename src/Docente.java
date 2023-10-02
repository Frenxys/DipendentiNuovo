
public class Docente extends Dipendente{
	private String ruolo;
	private String disciplina;
	
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Docente(String nominativo, char genere, String indirizzo,String ruolo,String disciplina) {
		super(nominativo, genere, indirizzo);
		setRuolo(ruolo);
		setDisciplina(disciplina);
		// TODO Auto-generated constructor stub
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Docente [ruolo=" + ruolo + ", disciplina=" + disciplina + "," + super.toString() + "]";
	}
	
}
