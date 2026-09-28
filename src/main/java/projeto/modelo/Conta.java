package projeto.modelo;

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método que as subclasses irão sobrescrever
    public double calcularRendimento() {
        return 0.0;
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta " + numero + ": R$ " + saldo);
    }

    public void exibirInformacoes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Conta{titular='" + titular + "', numero=" + numero
                + ", saldo=" + saldo + "}";
    }
}