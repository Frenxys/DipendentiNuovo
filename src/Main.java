
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendenti d=new Dipendenti();
		Impiegato i=new Impiegato("nome1",'M',"indirizzo1","ufficio1");
		Impiegato i2=new Impiegato("nome2",'M',"indirizzo2","ufficio2");
		Docente d1=new Docente("nome3",'F',"indirizzo3","ruolo","disciplina");
		Docente d2=new Docente("nome4",'F',"indirizzo4","ruolo","disciplina");
		d.addDipendente(i);
		d.addDipendente(i2);
		d.addDipendente(d1);
		d.addDipendente(d2);
		d.stampaDipendenti();
		d.eliminaDipendente("nome1");
		d.stampaDipendenti();

	}

}
