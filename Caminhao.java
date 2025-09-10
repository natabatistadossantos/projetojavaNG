
public class Caminhao extends Veiculo {
        private double capacidadeCarga;

        public Caminhao(String placa, String modelo, int ano, double precoDiaria, boolean disponivel, double capacidadeCarga) {
                
                super(placa, modelo, ano, precoDiaria, disponivel);
                this.capacidadeCarga = capacidadeCarga;
            }
        
        // getters e setters da capacidade de carga 
        public double getCapacidadeCarga(){return capacidadeCarga;}
        public void setCapacidadeCarga(double capacidadeCarga){this.capacidadeCarga=capacidadeCarga;}

        //metodo exibir do veiculo customizado para o caminhão
        @Override
        public void exibirDetalhes(){
        System.out.println("Placa Caminhão: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço Diária:" + getPrecoDiaria());
        System.out.println("Disponível: " + isDisponivel());
        System.out.println("capacidade de carga:"+capacidadeCarga);
        }
}

