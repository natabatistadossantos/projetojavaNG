import model.*;
import java.util.*;
import java.io.*;

public class Main {
private static Scanner sc = new Scanner(System.in);
private static GerenciadorAluguel gerenciador = new GerenciadorAluguel();
private static final String ARQUIVO = "arquivotxt\\dados.txt";


    
    private static Veiculo veiculoCadastrado;

    public static void main(String[] args) {
        carregarArquivo();

        int opcao;
        do {
            System.out.println("\n Locadora de Veiculos");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veículo");
            System.out.println("3 - Aluguel");
            System.out.println("4 - Listar Aluguel");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1: cadastrarCliente(); break;
                case 2: cadastrarVeiculo(); break;
                case 3: cadastrarAluguel(); break;
                case 4: gerenciador.listarAlugueis(); break;
                case 0:
                    salvarArquivo();
                    break;
                default: System.out.println("Opção inválida");
            }
        } while(opcao != 0);
    }

    private static void cadastrarCliente() {
        System.out.print("Nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("CNH: ");
        String cnh = sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome, cnh);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarVeiculo() {
    System.out.println("Tipo de veículo: 1 - Carro    2 - Caminhão   3 - Moto");
    int tipo = sc.nextInt();
    sc.nextLine();

    System.out.print("Placa: ");
    String placa = sc.nextLine();
    System.out.print("Modelo: ");
    String modelo = sc.nextLine();
    System.out.print("Ano: ");
    int ano = sc.nextInt();
    System.out.print("Preço diária: ");
    double preco = sc.nextDouble();
    sc.nextLine();

    switch(tipo) {
        case 1:
            System.out.print("Número de portas: ");
            int portas = sc.nextInt();
            sc.nextLine();
            veiculoCadastrado = new Carro(placa, modelo, ano, preco, true, portas);
            break;
        case 2:
            System.out.print("Capacidade de carga (kg): ");
            double carga = sc.nextDouble();
            sc.nextLine();
            veiculoCadastrado = new Caminhao(placa, modelo, ano, preco, true, carga);
            break;
        case 3:
            System.out.print("Cilindradas da moto: ");
            int cilindradas = sc.nextInt();
            sc.nextLine();
            veiculoCadastrado = new Moto(placa, modelo, ano, preco, true, cilindradas);
            break;
        default:
            System.out.println("Tipo inválido!");
            return;
    }
    System.out.println("Veículo cadastrado com sucesso!");
}


    private static void cadastrarAluguel() {
        if (veiculoCadastrado == null) {
            System.out.println("Nenhum veículo cadastrado. Cadastre um veículo primeiro!");
            return;
        }

        System.out.print("ID do Aluguel: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("CNH: ");
        String cnh = sc.nextLine();
        System.out.print("Dias alugados: ");
        int dias = sc.nextInt();
        sc.nextLine();

        Cliente cliente = new Cliente(cpf, nome, cnh);
        Aluguel aluguel = new Aluguel(id, cliente, veiculoCadastrado, dias, 0);
        aluguel.setValorTotal(aluguel.calcularValorTotal());
        gerenciador.adicionarAluguel(aluguel);

        System.out.println("Aluguel cadastrado com sucesso!");
    }

    // arquivo txt 
    
    private static void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Aluguel a : gerenciador.getAlugueis()) {
                bw.write(a.getId() + ";" +
                         a.getCliente().getNome() + ";" +
                         a.getCliente().getCpf() + ";" +
                         a.getCliente().getCnh() + ";" +
                         a.getVeiculo().getModelo() + ";" +
                         a.getVeiculo().getPlaca() + ";" +
                         a.getVeiculo().getPrecoDiaria() + ";" +
                         a.getDiasAlugados() + ";" +
                         a.getValorTotal());
                bw.newLine();
            }
            System.out.println("Dados salvos no arquivo '" + ARQUIVO + "' com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private static void carregarArquivo() {
        File f = new File(ARQUIVO);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String cpf = dados[2];
                String cnh = dados[3];
                String modelo = dados[4];
                String placa = dados[5];
                double preco = Double.parseDouble(dados[6]);
                int dias = Integer.parseInt(dados[7]);
                double valor = Double.parseDouble(dados[8]);

                Cliente cliente = new Cliente(cpf, nome, cnh);
                Veiculo veiculo = new Carro(placa, modelo, 2020, preco, true, 4); // simplificação
                Aluguel aluguel = new Aluguel(id, cliente, veiculo, dias, valor);
                gerenciador.adicionarAluguel(aluguel);
                veiculoCadastrado = veiculo; // último veículo carregado
            }
            System.out.println("Dados carregados do arquivo '" + ARQUIVO + "' com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }
}
