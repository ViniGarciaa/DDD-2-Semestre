package Ex05;

public class ContaPoupan�a extends Conta {

    private double rentabilidade;

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupan�a(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public ContaPoupan�a() {
    }
}