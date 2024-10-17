package entreprise;

public class employer extends Entreprise {
	private double hsupp;
	private double phsupp;
	
	public employer(int matricule,String nom,int Recrutement,double hsupp,double phsupp) {
		super(matricule,nom,Recrutement);
		this.hsupp=hsupp;
		this.phsupp=phsupp;
	}

	public double getHsupp() {
		return hsupp;
	}

	public void setHsupp(int hsupp) {
		this.hsupp = hsupp;
	}

	public double getPhsupp() {
		return phsupp;
	}

	public void setPhsupp(int phsupp) {
		this.phsupp = phsupp;
	}

	@Override
	public String toString() {
		return "employer [hsupp=" + this.hsupp + ", phsupp=" + this.phsupp + "]";
	}
	public void affiche() {
		System.out.println("c'est un employer");
		System.out.println(super.toString());
		System.out.println(toString());
	}
	public double salaire() {
		return (super.salaire()+(this.hsupp*this.phsupp));
	}

}
