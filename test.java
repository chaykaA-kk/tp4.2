package entreprise;

public class test {

	public static void main(String[] args) {
		Entreprise tabSALARIE[]=new Entreprise[5];
		tabSALARIE[0]=new employer(12345,"Walid",2002,15,4);
		tabSALARIE[1]=new vendeur(23445,"Yessine",2007,1000,0.1);
		tabSALARIE[2]=new vendeur(65478,"Nassime",2000,700,0.1);
		tabSALARIE[3]=new employer(87698,"Aymen ",2003,19,5);
		tabSALARIE[4]=new employer(12345,"Khaled",2008,7,4);
		System.out.println("******************************** Liste des Employés****************************");
		for(int i=0;i<5;i++) {
			if(tabSALARIE[i]instanceof employer) {
				tabSALARIE[i].affiche();
			}
		}
		System.out.println("********************************** Liste des Vendeurs ***************************");
		for(int i=0;i<5;i++) {
			if(tabSALARIE[i]instanceof vendeur) {
				tabSALARIE[i].affiche();
			}
		}
		System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");
		Entreprise anciensalarier=tabSALARIE[0];
		for(int i=0;i<5;i++) {
			if(anciensalarier.getrecrutement()<tabSALARIE[i].getrecrutement()) {
				anciensalarier=tabSALARIE[i];
			}
		}
		System.out.println("nom:"+anciensalarier.nom+"a salarié le plus ancien dans l'entreprise");
		
		System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
		
		Entreprise maxv=null;
		for(int i=0;i<5;i++) {
			if(tabSALARIE[i] instanceof vendeur ) {
				if(maxv==null) {
					maxv=tabSALARIE[i];
				}
				else if(tabSALARIE[i].salaire()>maxv.salaire()) {
						anciensalarier=tabSALARIE[i];
					}
				}

		}

		System.out.println("la matricule="+anciensalarier.matricule+"du vendeur disposant du plus grand salaire");
			
	}

}
