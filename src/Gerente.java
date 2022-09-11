
public class Gerente extends Funcionario implements Autenticavel{ //Class Gerente herda tudo de Funcionario. e implementa a interface autenticavel
	private int senha; // iniciada com construtor padrão = 0; Podendo ser alterada com o método setSenha;
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return getSalario(); //chamada de metódos da super class, não se pode mais usar o getBonificação padrão pois é um método abstract;
	}
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;			
		}else {
			return false;
		}
	
}
