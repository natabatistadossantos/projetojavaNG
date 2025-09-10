public interface IAluguel {
    void adicionarAluguel(Aluguel aluguel);
    Aluguel buscarAluguelPorId(int id);
    void listarAlugueis();
}