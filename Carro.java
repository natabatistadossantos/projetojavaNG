public class Carro extends Veiculo {
private int numeroPortas;

    public Carro(String placa, String modelo, int ano, double precoDiaria, boolean disponivel, int numeroPortas){

        super(placa, modelo, ano, precoDiaria, disponivel );
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        
    }

    public void exibirdetalhes() {
        
    }


}
