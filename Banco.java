package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
