package Ex01;

public class ContaPoupan�a extends Conta{
    private double rentabilidade;
 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupan�a() {
    }
   
    public ContaPoupan�a(String agencia, String numero, double saldo, double rentabilidade, int id) {
        super(agencia, numero, saldo, id);
       
        this.rentabilidade = rentabilidade;
    }
}