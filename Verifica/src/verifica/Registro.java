package verifica;
import java.util.Scanner;
import java.util.ArrayList;

public class Registro {
	private static ArrayList<Studente> lista = new ArrayList<>(); //ArrayList per l'elenco degli studenti
	
	public void ElencoStudenti(){ //metodo per stampare l'elenco
		System.out.println(lista.toString());
		
	}
	
	public static Studente CercaStudente(String matricola) {  //metodo per cercare gli studenti
		Scanner scanner= new Scanner(System.in);
			System.out.println("Inserisci la matricola dello studente: ");
		matricola = scanner.nextLine();
		
			for (Studente studente : lista) {
				if (studente.prendiMatricola().equals(matricola)) {
					return studente;
				}
			}
					return null;
	}
	
	public static void main(String[] args) {   
		Registro registro = new Registro();  //nuovo oggetto per prendere i metodi
		Scanner scanner = new Scanner(System.in);
		int i=2;
			while (i>1) { //ciclo per far continuare il menu
				System.out.println("Menu: 1)Aggiungi studente 2)Elenco studenti 3)Cerca studente 4)Esci.");
				int scelta = scanner.nextInt();
			
				switch (scelta) {
				case 1: System.out.print("Nome: ");
						String nome = scanner.nextLine();
						System.out.print("Cognome: ");
						String cognome = scanner.nextLine();
						System.out.print("Matricola: ");
						String matricola = scanner.nextLine();
						Studente nuovoStudente = new Studente(nome, cognome, matricola);
						lista.add(nuovoStudente);
				break;
				case 2: registro.ElencoStudenti();
				break;
				case 3: System.out.print("Inserisci matricola: ");
						matricola = scanner.nextLine();
						System.out.println(CercaStudente(matricola));
				break;
				case 4: System.out.println("Fine.");
		scanner.close();
				return;
				default: System.out.println("Codice errato.");
				}
			}
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