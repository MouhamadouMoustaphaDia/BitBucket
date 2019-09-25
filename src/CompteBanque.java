
public class CompteBanque {
	
	private double solde;
	


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}

	//initialisation du compte
	public void initialisation(int solde) {
		this.solde = solde;
	}
	
	//consultation du solde
	public void consultation() {
		System.out.println("Le solde de votre compte est: "+solde);
	}
	
	//debit du compte
	public void debitCompte(double debit) {
		do {
			this.solde -= debit;
		}while(solde > debit && debit >0);
	}
	
	//Crediter le compte
		public void CreditCompte(double credit) {
			do {
				this.solde += credit;
			}while(credit>0);
		}
		
	//virement
		 
		public void virement(CompteBanque compte, double val) {
			this.solde -= val;
			compte.CreditCompte(val);
		}

		
	

	
}
