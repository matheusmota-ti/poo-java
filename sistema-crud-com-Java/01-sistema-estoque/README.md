# 📦 Sistema de Cadastro de Produtos (CRUD em Java)

Aplicação de linha de comando (CLI) para gerenciar um estoque de produtos, com **CRUD completo**, **validação de entrada** e código **modular organizado em pacotes**. Os dados ficam apenas em memória (sem persistência) e o programa roda até o usuário digitar `0`.

## ✨ Funcionalidades
- **Cadastrar produto:** nome, quantidade e preço, com validação (nome não vazio, quantidade inteira ≥ 0, preço > 0; aceita vírgula ou ponto).
- **Listar produtos:** mostra todos os produtos com seus índices.
- **Atualizar produto:** escolhe um produto pelo índice e altera nome, quantidade e preço.
- **Remover produto:** exclui o produto pelo índice informado.
- **Encerrar:** opção `0`.

## 🧠 Conceitos aplicados
- Programação Orientada a Objetos: classes, objetos e encapsulamento (atributos privados com getters e setters)
- Organização do código em pacotes (`main`, `model`, `estruturas`)
- Comparação entre `ArrayList` (tamanho dinâmico) e array de tamanho fixo com contador manual
- Estruturas condicionais, laços de repetição e funções
- Tratamento de entrada inválida (`try/catch` com `NumberFormatException`)

## 🖥️ Exemplo de uso
```
Bem vindo ao sistema de cadastro
1 - Cadastrar produto
2 - Listar produtos
3 - Atualizar produto
4 - Remover produto
0 - Encerrar
Digite a opção: 1
Digite o nome do produto: Caneta
Digite a quantidade do produto: 10
Digite o preço do produto: 2,50
Produto adicionado!

Digite a opção: 2
[0] Caneta | Quantidade: 10 | Preço: R$ 2.50
```

## 📁 Estrutura do projeto
```
src/
├── main/Main.java                  # menu e interação com o usuário
├── model/Produto.java              # classe de dados
└── estruturas/
    ├── EstruturaList.java          # CRUD com ArrayList (usada no programa)
    └── EstruturaArray.java         # CRUD com array fixo (versão comparativa)
```

## 🚀 Como executar
Requisito: JDK instalado (Java 8 ou superior).

1. Abra o terminal nesta pasta (a que contém a pasta `src`).
2. Compile:
   ```
   javac -encoding UTF-8 -d out src/main/Main.java src/model/Produto.java src/estruturas/EstruturaList.java src/estruturas/EstruturaArray.java
   ```
3. Execute:
   ```
   java -cp out main.Main
   ```
4. Use o menu digitando o número da opção desejada.
