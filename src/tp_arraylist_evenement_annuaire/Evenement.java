package tp_arraylist_evenement_annuaire;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Evenement {
	String intitule;
	String lieu;
	GregorianCalendar debut;
	GregorianCalendar fin;
	
	Evenement(String intitule, String lieu, GregorianCalendar debut, GregorianCalendar fin){
		this.intitule = intitule;
		this.lieu = lieu;
		if(debut.compareTo(fin) == -1){
			this.debut = debut;
			this.fin = fin;
		}else{
			System.out.println("erreur");
			this.debut = fin;
			this.fin = fin;
		}
		
	}
	public String toString() {
		return "Evenement [intitule=" + intitule + ", lieu=" + lieu + ", debut=" + debut.get(Calendar.DAY_OF_MONTH)+"/"+(debut.get(Calendar.MONTH)+1)+"/"+debut.get(Calendar.YEAR) + ", fin=" + fin.get(Calendar.DAY_OF_MONTH)+"/"+(fin.get(Calendar.MONTH)+1)+"/"+fin.get(Calendar.YEAR) + "]";
	}
	boolean equals(Evenement evenement){
		if(this.intitule == evenement.intitule && this.lieu == evenement.lieu && this.debut.equals(evenement.debut) && this.fin.equals(evenement.fin)){
			return true;
		}else{
			return false;
		}
	}
	boolean chevauche(Evenement evenement){
		if(this.fin.before(evenement.debut)){
			return false;
		}else if(evenement.fin.before(this.debut)){
			return false;
		}
		return true;
	}
}
