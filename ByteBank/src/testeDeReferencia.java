
public class testeDeReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100; 
		System.out.println(" o valor da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são as mesmas contas");
			
		}
	}
	
	

}
