package Ex02;

public class Pessoa {
	
	private int id;
	private String nome;
	private String endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereco(String endereço) {
		this.endereço = endereço;
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
	
	Pessoa(int id, String nome, String endereço, int telefone) {
		this.id = id;
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}

}