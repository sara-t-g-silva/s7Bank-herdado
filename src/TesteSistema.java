
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente gerenteTest = new Gerente();
		gerenteTest.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(gerenteTest);
		
		
		

	}

}
