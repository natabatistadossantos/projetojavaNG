
public abstract class Veiculo {

    // Atributos privados
    private String placa;
    private String modelo;
    private int ano;
    private double precoDiaria;
    private boolean disponivel;

    // Construtor
    public Veiculo(String placa, String modelo, int ano, double precoDiaria, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    // getters e setters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public abstract void exibirDetalhes();
}
