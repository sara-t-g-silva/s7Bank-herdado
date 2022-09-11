
public class Cliente implements Autenticavel { // implementação de interface para acesso de sistema de autenticação por cliente que não é um funcionário
	
	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		{
			if(this.senha == senha) {
				return true;
			}else {
				return false;
			}
	}
	
	

}
