package estruturas;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class EstruturaList {
    // Instanciar a lista, não precisa de tamanho fixo
    // e nem de contador manual
    private List<Produto> estoque = new ArrayList<>();

    public void adicionar(Produto p){
        estoque.add(p);
        System.out.println("Produto adicionado!");
    }

    public void listar(){
        if(estoque.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for(int i = 0; i < estoque.size(); i++){
            System.out.println("[" + i + "] " + estoque.get(i));
        }
    }

    public void atualizar(int indice, Produto novo){
        if(indice >= 0 && indice < estoque.size()){
            estoque.set(indice, novo);
            System.out.println("Produto atualizado!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }

    public void remover(int indice){
        if(indice >= 0 && indice < estoque.size()){
            estoque.remove(indice);
            System.out.println("Produto removido!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }

    public Produto buscar(int indice){
        if(indice >= 0 && indice < estoque.size()){
            return estoque.get(indice);
        }
        return null;
    }

    public int tamanho(){
        return estoque.size();
    }
}
