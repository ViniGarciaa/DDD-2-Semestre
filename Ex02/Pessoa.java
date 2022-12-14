package Ex02;

public class Pessoa {
	
	private int id;
	private String nome;
	private String enderešo;
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEndereco(String enderešo) {
		this.enderešo = enderešo;
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
	
	Pessoa(int id, String nome, String enderešo, int telefone) {
		this.id = id;
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}

}