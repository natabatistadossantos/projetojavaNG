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

    //metodo exibir do veiculo mais customizado para o carro
    @override
    public void exibirdetalhes() {
        System.out.println("Placa carro " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço Diária:" + getPrecoDiaria());
        System.out.println("Disponível: " + isDisponivel());
        System.out.println("Numero de portas:"+ numeroPortas);
    }


}
