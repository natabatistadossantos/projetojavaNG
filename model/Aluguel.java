package model;
public class Aluguel { 
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private int diasAlugados;
    private double valorTotal;

    //construtor 
    public Aluguel(int id, Cliente cliente, Veiculo veiculo, int diasAlugados, double valorTotal){
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diasAlugados = diasAlugados;
        this.valorTotal = valorTotal;
    }

    //getters e setters
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public Cliente getCliente (){return cliente;}
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    public Veiculo getVeiculo(){return veiculo;}
    public void setVeiculo(Veiculo veiculo){this.veiculo=veiculo;}
    public int getDiasAlugados(){return diasAlugados;}
    public void setDiasAlugados(int diasAlugados){this.diasAlugados=diasAlugados;}
    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal; }

    public double calcularValorTotal(){
        return diasAlugados*veiculo.getPrecoDiaria();
    }

    
}