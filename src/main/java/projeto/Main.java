package projeto;

import projeto.modelo.Conta;
import projeto.modelo.ContaCorrente;
import projeto.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Cliente Padrão", 1, 500.0));
        contas.add(new ContaCorrente("Cliente Corrente", 2, 1000.0, 300.0));
        contas.add(new ContaPoupanca("Cliente Poupança", 3, 2000.0, 0.005));

        for (Conta conta : contas) {
            conta.exibirInformacoes();
            System.out.println("Rendimento calculado: R$ " + conta.calcularRendimento());
            System.out.println("---");
        }
    }
}