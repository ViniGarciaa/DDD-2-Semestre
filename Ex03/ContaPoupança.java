package Ex03;

public class ContaPoupanša extends Conta {

    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupanša(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupanša() {
    }
}
