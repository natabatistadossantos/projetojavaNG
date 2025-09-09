
public class Caminhao extends Veiculo {
        private double capacidadeCarga;

        public Caminhao(String placa, String modelo, int ano, double precoDiaria, boolean disponivel) {
                
                super(placa, modelo, ano, precoDiaria, disponivel);
                this.capacidadeCarga = capacidadeCarga;
            }
        
        // getters e setters da capacidade de carga 
        public double getCapacidadeCarga(){return capacidadeCarga;}
        public void setCapacidadeCarga(double capacidadeCarga){return capacidadeCarga;}
}

