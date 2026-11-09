package estruturas;

import model.Produto;

// Versão com array de tamanho fixo (para comparação com EstruturaList).
public class EstruturaArray {
    // É necessário definir um tamanho máximo
    private Produto[] estoque = new Produto[100];
    // Contador manual para o indice
    private int contador = 0;

    public void adicionar(Produto p){
        if(contador < estoque.length){
            estoque[contador] = p;
            contador++;
            System.out.println("Produto adicionado!");
        }else{
            System.out.println("Lista de produtos está cheia!");
        }
    }

    public void listar(){
        if(contador == 0){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for(int i = 0; i < contador; i++){
            System.out.println("[" + i + "] " + estoque[i]);
        }
    }

    public void atualizar(int indice, Produto novo){
        if(indice >= 0 && indice < contador){
            estoque[indice] = novo;
            System.out.println("Produto atualizado!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }

    public void remover(int indice){
        if(indice >= 0 && indice < contador){
            // Deslocar todos os itens para a esquerda
            // para preencher o elemento removido
            // (i < contador - 1 evita acessar posição fora do último item)
            for(int i = indice; i < contador - 1; i++){
                estoque[i] = estoque[i+1];
            }
            // Limpa a ultima posição que ficou duplicada
            estoque[contador-1] = null;
            contador--;
            System.out.println("Produto removido!");
        }
        else{
            System.out.println("Índice inválido!");
        }
    }

    public Produto buscar(int indice){
        if(indice >= 0 && indice < contador){
            return estoque[indice];
        }
        return null;
    }

    public int tamanho(){
        return contador;
    }
}
