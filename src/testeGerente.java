
public class testeGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("gerente1"); // setNome herdado da classe Funcionario
		gerente.setCpf("123456798");
		gerente.setSalario(5000.0);
		gerente.setSenha(1234);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
		boolean atenticou = gerente.autentica(1234);
		
		System.out.println(atenticou);
		
		System.out.println(gerente.getBonificacao());
		
		System.out.println();
		

	}

}
