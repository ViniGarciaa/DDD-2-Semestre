package Ex01;

public class ContaPoupança extends Conta{
    private double rentabilidade;
 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupança() {
    }
   
    public ContaPoupança(String agencia, String numero, double saldo, double rentabilidade, int id) {
        super(agencia, numero, saldo, id);
       
        this.rentabilidade = rentabilidade;
    }
}