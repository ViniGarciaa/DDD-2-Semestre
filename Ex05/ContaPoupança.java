package Ex05;

public class ContaPoupança extends Conta {

    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupança(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupança() {
    }
}