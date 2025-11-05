
package model;
import java.util.Scanner;

public class AluguelCadastro {
    private GerenciadorAluguel gerenciador;
    private Veiculo veiculoCadastrado;

    
    public AluguelCadastro(GerenciadorAluguel gerenciador, Veiculo veiculoCadastrado) {
        this.gerenciador = gerenciador;
        this.veiculoCadastrado = veiculoCadastrado;
    }


    public void cadastrarAluguel() {
        if (veiculoCadastrado == null) {
            System.out.println("Erro: Cadastre um veículo");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("ID do Aluguel: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("CNH: ");
        String cnh = sc.nextLine();
        System.out.print("Dias alugados: ");
        int dias = sc.nextInt();
        sc.nextLine();
        Cliente cliente = new Cliente(cpf, nome, cnh);
        Aluguel aluguel = new Aluguel(id, cliente, veiculoCadastrado, dias, 0);
        aluguel.setValorTotal(aluguel.calcularValorTotal());
        gerenciador.adicionarAluguel(aluguel);
        System.out.println("Aluguel cadastrado");
    }

    // Atualiza o veículo após cadastro
    public void setVeiculoCadastrado(Veiculo veiculo) {
        this.veiculoCadastrado = veiculo;
    }
}