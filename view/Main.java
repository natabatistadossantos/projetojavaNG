import model.Aluguel;
import model.Carro;
import model.Cliente;
import model.Caminhao;
import model.GerenciadorAluguel;
import model.IAluguel;
import model.Veiculo;


public class Main {
    public static void main(String[] args) {
        // Criando cliente
        Cliente cliente = new Cliente("12345678900", "Ana Maria", "CNH98765");

        // Criando veículo - carro
        Carro carro = new Carro("ABC1234", "Kwid", 2019, 120.0, true, 4);

        // Criando aluguel
        Aluguel aluguel = new Aluguel(1, cliente, carro, 3, 0);

        // Calculando valor total e setando
        aluguel.setValorTotal(aluguel.calcularValorTotal());

        // Imprimindo dados
        System.out.println("Cliente: " + aluguel.getCliente().getNome());
        System.out.println("Veiculo: " + aluguel.getVeiculo().getModelo());
        System.out.println("Dias alugados: " + aluguel.getDiasAlugados());
        System.out.println("Valor total do aluguel: R$ " + aluguel.getValorTotal());
    }
}
