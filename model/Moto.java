package model;

public class Moto extends Veiculo {
    private int cilindradas; // atributo específico da moto

    // Construtor
    public Moto(String placa, String modelo, int ano, double precoDiaria, boolean disponivel, int cilindradas) {
        super(placa, modelo, ano, 50, disponivel);
        this.cilindradas = cilindradas;
    }

    // Getters e setters
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescrevendo exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.println("Placa da Moto: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço Diária: " + getPrecoDiaria());
        System.out.println("Disponível: " + isDisponivel());
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}

