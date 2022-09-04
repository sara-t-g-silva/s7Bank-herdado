
public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("sara");
		funcionario.setCpf("123456789");
		funcionario.setSalario(2500.0);
		
		System.out.println(funcionario.getBonificacao());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());

	}

}
