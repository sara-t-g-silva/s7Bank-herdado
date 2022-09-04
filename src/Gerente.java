
public class Gerente extends Funcionario { //Class Gerente herda tudo de Funcionario.
	private int senha; // iniciada com construtor padrão = 0; Podendo ser alterada com o método setSenha;
	
	boolean atentica(int senha) {
		if(this.senha == senha) {
			return true;			
		}else {
			return false;
		}	
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
