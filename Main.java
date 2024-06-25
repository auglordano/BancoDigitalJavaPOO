package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Alice Silva");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João Souza");

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        Conta contaPoupanca1 = new ContaPoupanca(cliente1);

        Conta contaCorrente2 = new ContaCorrente(cliente2);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        System.out.println("=== Clientes do " + banco.getNome() + " ===");
        banco.listarClientes();

        System.out.println("\n=== Operações Conta Corrente Alice ===");
        contaCorrente1.depositar(1000);
        contaCorrente1.imprimirExtrato();

        System.out.println("\n=== Operações Conta Poupança Alice ===");
        contaPoupanca1.depositar(1500);
        contaPoupanca1.imprimirExtrato();

        System.out.println("\n=== Operações Conta Corrente João ===");
        contaCorrente2.depositar(2000);
        contaCorrente2.imprimirExtrato();

        System.out.println("\n=== Operações Conta Poupança João ===");
        contaPoupanca2.depositar(2500);
        contaPoupanca2.imprimirExtrato();

        System.out.println("\n=== Transferência da Conta Corrente de Alice para Conta Corrente de João ===");
        contaCorrente1.transferir(500, contaCorrente2);
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
    }
}