package projeto;

import projeto.modelo.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Teste", 1, 100.0);
        conta.exibirInformacoes();
    }
}