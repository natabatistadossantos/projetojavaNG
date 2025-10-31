package model;
public class Cliente {
    private String cpf;
    private String nome;
    private String cnh;

    public Cliente (String cpf, String nome, String cnh){
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
    }
    // getters e setters para os atributos da classe cliente 
    public String getCpf(){return cpf;}
    public void setCpf(String cpf){this.cpf=cpf;}
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}
    public String getCnh(){return cnh;}
    public void setCnh(String cnh){this.cnh=cnh;}
}