import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluguel implements IAluguel {

    private List<Aluguel> alugueis;

    public GerenciadorAluguel() {
        this.alugueis = new ArrayList<>();
    }

    @Override
    public void adicionarAluguel(Aluguel aluguel) {
        if (aluguel != null) {
            alugueis.add(aluguel);
            System.out.println("Aluguel adicionado com sucesso! ID: " + aluguel.getId());
        } else {
            System.out.println("Não foi possível adicionar: aluguel inválido.");
        }
    }

    @Override
    public Aluguel buscarAluguelPorId(int id) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getId() == id) {
                return aluguel;
            }
        }
        System.out.println("Aluguel com ID " + id + " não encontrado.");
        return null;
    }

    @Override
    public void listarAlugueis() {
        if (alugueis.isEmpty()) {
            System.out.println("Nenhum aluguel cadastrado.");
        } else {
            System.out.println("Lista de Aluguéis:");
            for (Aluguel aluguel : alugueis) {
                System.out.println("---------------------------");
                System.out.println("ID: " + aluguel.getId());
                System.out.println("Cliente: " + aluguel.getCliente().getNome());
                System.out.println("Veículo: " + aluguel.getVeiculo().getModelo());
            }
        }
    }

   
    public List<Aluguel> getAlugueis() {
        return alugueis;
    }
}
