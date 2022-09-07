
public class TesteReferencias {
	
	public static void main(String []args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		
		Funcionario ed = new EditorVideo();
		ed.setSalario(2000.0);
		
		Funcionario d = new Designer();
		d.setSalario(2500.0);
		
		controle.registra(ed);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		
		
	}

}
