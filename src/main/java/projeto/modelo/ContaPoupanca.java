package projeto.modelo;

public class ContaPoupanca extends Conta {

    private double taxaRendimento; // ex: 0.005 = 0,5% ao mês

    public ContaPoupanca(String titular, int numero, double saldo, double taxaRendimento) {
        super(titular, numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Conta poupança rende com base na taxa
    @Override
    public double calcularRendimento() {
        return getSaldo() * taxaRendimento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(this);
        System.out.println("Rendimento estimado: R$ " + calcularRendimento());
    }

    @Override
    public String toString() {
        return "ContaPoupanca{titular='" + getTitular() + "', numero=" + getNumero()
                + ", saldo=" + getSaldo() + ", taxaRendimento=" + taxaRendimento + "}";
    }
}