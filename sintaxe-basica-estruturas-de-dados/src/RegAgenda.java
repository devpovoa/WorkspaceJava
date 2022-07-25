//Estrutura exemplificada de uma classe Registro Agente utilizando (POO) método construtor, função.
public class RegAgenda {
	private String nome;
	private String end;
	private String tel;

	public RegAgenda(String nome, String end, String tel) {
		this.nome = nome;
		this.end = end;
		this.tel = tel;
	}

	public String mostraNome() {
		return nome;
	}

	public String mostraEnd() {
		return end;
	}

	public String mostraTel() {
		return tel;
	}

	public void alteraEnd(String end) {
		this.end = end;

	}

	public void alteraTel(String tel) {
		this.tel = tel;
	}
}
