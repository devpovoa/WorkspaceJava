
public class TesteRefencias {

	public static void main(String[] args) {

		Gerente novoGerente = new Gerente();
		novoGerente.setNome("Thiago Povoa");
		String nome = novoGerente.getNome();
		System.out.println(nome);
		novoGerente.setSalario(5000.0);

		EditorDeVideos editorVideos = new EditorDeVideos();
		editorVideos.setSalario(2500.0);

		Designer designers = new Designer();
		designers.setSalario(2000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(novoGerente);
		controle.registra(editorVideos);
		controle.registra(designers);

		double exibeSoma = controle.getSoma();
		System.out.println(exibeSoma);
	}
}
