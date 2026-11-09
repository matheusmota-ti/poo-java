package model;

public class Produto {
    private String nome;
    private int quantidade;
    private float valor;

    public Produto(String nome, int quantidade, float valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return String.format("%s | Quantidade: %d | Preço: R$ %.2f", nome, quantidade, valor);
    }
}
