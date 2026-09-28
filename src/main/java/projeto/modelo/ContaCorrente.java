package projeto.modelo;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String titular, int numero, double saldo, double limiteChequeEspecial) {
        super(titular, numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Conta corrente permite usar o limite do cheque especial
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() + limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    // Conta corrente não rende
    @Override
    public double calcularRendimento() {
        return 0.0;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(this);
        System.out.println("Limite disponível: R$ " + (getSaldo() + limiteChequeEspecial));
    }

    @Override
    public String toString() {
        return "ContaCorrente{titular='" + getTitular() + "', numero=" + getNumero()
                + ", saldo=" + getSaldo() + ", limiteChequeEspecial=" + limiteChequeEspecial + "}";
    }
}