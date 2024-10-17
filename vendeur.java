package entreprise;

public class vendeur extends Entreprise {
	double vente;
	double pourcentage;
	
	
	public vendeur(int matricule,String nom,int Recrutement ,double vente, double pourcentage) {
		super(matricule,nom,Recrutement); 
		this.vente=vente;
		this.pourcentage=pourcentage;
	}


	public double getVente() {
		return vente;
	}


	public void setVente(double vente) {
		this.vente = vente;
	}


	public double getPourcentage() {
		return pourcentage;
	}


	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}


	@Override
	public String toString() {
		return "vendeur [vente=" + vente + ", pourcentage=" + pourcentage + "]";
	}
	public void affiche() {
		System.out.println("c'est un vendeur");
		System.out.println(super.toString());
		System.out.println(toString());
	}
	public double salaire() {
		return (super.salaire()+(this.pourcentage*this.vente));
	}

}
