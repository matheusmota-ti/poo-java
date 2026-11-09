package main;

import java.util.Scanner;

import estruturas.EstruturaList;
import model.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // Lê um texto não vazio
    static String lerTexto(String mensagem){
        while(true){
            System.out.print(mensagem);
            String texto = sc.nextLine().trim();
            if(!texto.isEmpty()){
                return texto;
            }
            System.out.println("O valor não pode ser vazio. Tente novamente.");
        }
    }

    // Lê um inteiro >= minimo
    static int lerInt(String mensagem, int minimo){
        while(true){
            System.out.print(mensagem);
            try{
                int valor = Integer.parseInt(sc.nextLine().trim());
                if(valor >= minimo){
                    return valor;
                }
                System.out.println("O valor deve ser maior ou igual a " + minimo + ".");
            }catch(NumberFormatException e){
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    // Lê um número decimal > 0 (aceita vírgula ou ponto)
    static float lerFloat(String mensagem){
        while(true){
            System.out.print(mensagem);
            try{
                float valor = Float.parseFloat(sc.nextLine().trim().replace(',', '.'));
                if(valor > 0){
                    return valor;
                }
                System.out.println("O preço deve ser maior que zero.");
            }catch(NumberFormatException e){
                System.out.println("Digite um número válido (ex: 19.90).");
            }
        }
    }

    static void cadastrar(EstruturaList estoque){
        String nome = lerTexto("Digite o nome do produto: ");
        int quantidade = lerInt("Digite a quantidade do produto: ", 0);
        float valor = lerFloat("Digite o preço do produto: ");
        estoque.adicionar(new Produto(nome, quantidade, valor));
    }

    static void atualizar(EstruturaList estoque){
        if(estoque.tamanho() == 0){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        estoque.listar();
        int indice = lerInt("Digite o índice do produto a ser atualizado: ", 0);
        if(estoque.buscar(indice) == null){
            System.out.println("Índice inválido!");
            return;
        }
        String nome = lerTexto("Digite o novo nome do produto: ");
        int quantidade = lerInt("Digite a nova quantidade do produto: ", 0);
        float valor = lerFloat("Digite o novo preço do produto: ");
        estoque.atualizar(indice, new Produto(nome, quantidade, valor));
    }

    static void remover(EstruturaList estoque){
        if(estoque.tamanho() == 0){
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        estoque.listar();
        int indice = lerInt("Digite o índice do produto a ser removido: ", 0);
        estoque.remover(indice);
    }

    public static void main(String[] args){
        EstruturaList estoquePrincipal = new EstruturaList();

        while(true){
            System.out.println();
            System.out.println("Bem vindo ao sistema de cadastro");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Encerrar");
            int opcao = lerInt("Digite a opção: ", 0);

            if(opcao == 0){
                break;
            }
            switch (opcao) {
                case 1:
                    cadastrar(estoquePrincipal);
                    break;
                case 2:
                    estoquePrincipal.listar();
                    break;
                case 3:
                    atualizar(estoquePrincipal);
                    break;
                case 4:
                    remover(estoquePrincipal);
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    break;
            }
        }
        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
