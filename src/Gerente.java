
public class Gerente extends Funcionario implements Autenticavel{ //Class Gerente herda tudo de Funcionario. e implementa a interface autenticavel
	//private int senha; // iniciada com construtor padrão = 0; Podendo ser alterada com o método setSenha;
	
	public AutenticacaoUtil autenticador;
	
	public Gerente() {
		
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); // reaproveitamento de código de AutenticacaoUtil;
	}
	
	public double getBonificacao() {
		return getSalario(); //chamada de metódos da super class, não se pode mais usar o getBonificação padrão pois é um método abstract;
	}
	@Override
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha); // chama o construtor e o método dentro do construtor;
	}
		
}
