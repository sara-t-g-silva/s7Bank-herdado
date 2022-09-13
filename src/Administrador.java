
public class Administrador extends Funcionario implements Autenticavel {
	
	//private int senha;
	public AutenticacaoUtil autenticador; // é do tipo AutenticacaoUtil
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	public double getBonificacao() {
		
		return 0;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
	
