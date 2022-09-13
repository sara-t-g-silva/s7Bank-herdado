
public class Cliente implements Autenticavel { // implementação de interface para acesso de sistema de autenticação por cliente que não é um funcionário
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil(); // construtor para a criação de um cliente ser criado com um construtor de classe;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha); // delegando ao autenticacaoUtil para reproveitamento de código;
		}
		
}

