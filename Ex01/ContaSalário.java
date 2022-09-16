package Ex01;

public class ContaSalário extends Conta{
	private double saldoDia;

	public double getSaldoDia() {
		return saldoDia;
	}

	public void setSaldoDia(double saldoDia) {
		this.saldoDia = saldoDia;
	}
	
    public ContaSalário() {
    }
   
    public ContaSalário(String agencia, String numero, double saldo, double saldoDia, int id) {
        super(agencia, numero, saldo, id);
       
        this.saldoDia = saldoDia;
    }
}