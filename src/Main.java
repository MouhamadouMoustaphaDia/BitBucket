
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	CompteBanque compte = new CompteBanque();
	//init solde compte
	compte.setSolde(1000);
	compte.consultation();
	
	//creation compte2 pour effectuer un virement
	CompteBanque compte2 = new CompteBanque();
	//System.out.print("Virement");
	 
	//init solde compte2
	compte2.setSolde(500);
	//virement
	
	compte2.virement(compte, 300);
	 
	compte2.consultation();
	
	
	
	}

}
