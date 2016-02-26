package tp_arraylist_evenement_annuaire;
import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Evenement> agenda = new ArrayList<Evenement>(); 
	
	Agenda(){
	}
	public String toString(){
		String afficher = "";
		for(int i=0; i<agenda.size(); i++){
			afficher = afficher + agenda.get(i) + "\n";
		}
		return afficher;
	}
	boolean entrable(Evenement evenement){
		for(Evenement rdv : agenda){
			if(rdv.chevauche(evenement)){
				return false;
			}
		}
		return true;
	}
	void entrerEvenement(Evenement nouveau){
		if(this.entrable(nouveau)){
			agenda.add(nouveau);
		}else{
			System.out.println("erreur");
		}
	}
	void supprimerEvenement(Evenement evenement){
		agenda.remove(evenement);
	}
	void supprimerEvenement(int indice){
		agenda.remove(indice);
	}
}
