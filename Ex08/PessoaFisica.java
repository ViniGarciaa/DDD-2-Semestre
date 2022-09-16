package Ex08;

public class PessoaFisica extends Pessoa implements PessoaInterface {

	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica() {

	}

	@Override
	public String verNome() {
		return null;
	}
}