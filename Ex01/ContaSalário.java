package Ex01;

public class ContaSal�rio extends Conta{
	private double saldoDia;

	public double getSaldoDia() {
		return saldoDia;
	}

	public void setSaldoDia(double saldoDia) {
		this.saldoDia = saldoDia;
	}
	
    public ContaSal�rio() {
    }
   
    public ContaSal�rio(String agencia, String numero, double saldo, double saldoDia, int id) {
        super(agencia, numero, saldo, id);
       
        this.saldoDia = saldoDia;
    }
}