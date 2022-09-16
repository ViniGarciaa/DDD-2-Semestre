package Ex02;

public class Pessoa {
	
	private int id;
	private String nome;
	private String endere�o;
	private int telefone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndereco(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	protected String exibirMensagem() {
        return "Realize o Cadastro de Pessoas!";
    }  
	
	Pessoa() {
		
	}
	
	Pessoa(int id, String nome, String endere�o, int telefone) {
		this.id = id;
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

}