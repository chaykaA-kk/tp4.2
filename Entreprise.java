package entreprise;

public class Entreprise {
	protected int matricule;
	protected String nom;
	protected int Recrutement;
	
	
	public Entreprise(int mat,String no,int rec) {
		this.matricule=mat;
		this.nom=no;
		this.Recrutement=rec;
	}
	public Entreprise() {
		
	}
	public int getmatricule() {
		 return matricule ;
	}
	public String getnom() {
		 return nom ;
	}
	public int getrecrutement() {
		 return Recrutement ;
	}
	public void setmarticule(int matricule){
		this.matricule=matricule;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setRecrutement(int Recrutement) {
		this.Recrutement=Recrutement;
	}
	@Override
	public String toString() {
		return "Entreprise [matricule=" + matricule + ", nom=" + nom + ", Recrutement=" + Recrutement + "]";
	}
	public void affiche() {
		this.toString();
		System.out.println(toString());
	}
	public double salaire() {
		if(this.Recrutement <2005  ) {
			return 400;
		}
		else {
			return 280;
		}
	
	
	







	}
}
	
