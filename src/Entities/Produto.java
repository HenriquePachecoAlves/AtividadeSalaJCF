package Entities;

public class Produto {
    public Integer codigo;
    public String nome;
    public Double preco;

    public Produto(){

    }

    public Produto(Integer codigo, String nome, Double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco;
    }
}
