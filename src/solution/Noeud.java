package solution;

import probleme.Etat;
import probleme.action.Deplacement;

public class Noeud {
	private int coutChemin;
	private int profondeur;
	private Etat etat;
	private Noeud parent;
	private Deplacement action;
	
	public Noeud(Etat etat, Noeud parent, Deplacement action, int coutChemin, int profondeur) {
		this.etat = etat;
		this.parent = parent;
		this.action = action;
		this.coutChemin = coutChemin;
		this.profondeur = profondeur;
	}

	public int getCoutChemin() {
		return coutChemin;
	}

	public int getProfondeur() {
		return profondeur;
	}

	public Etat getEtat() {
		return etat;
	}

	public Noeud getParent() {
		return parent;
	}

	public Deplacement getAction() {
		return action;
	}
}
