package verifica;

public class Studente {
		String nome; 
		String cognome;
		String matricola;
		
	public Studente(String nome,String cognome,String matricola) { //costruttore
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
	}
	public String prendiNome() { //metodo per prendere il nome
		return nome;
	}
	
	public String prendiCognome() { //metodo per prendere il cognome
		return cognome;
	}
	
	public String prendiMatricola() { //metodo per prendere la matricola
		return matricola; 
	}
	
	public String toString() { //override poco funzionante
		String stringa =this.nome +"/"+ this.cognome +"/"+ this.matricola;
		return stringa;
	}
}

/*Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:
Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma*/