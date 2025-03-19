package Application;

import Entities.Produto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Produto> produtos = new HashMap<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por codigo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opcao de cadastro selecionada.");
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    Produto produto = new Produto(codigo, nome, preco);
                    produtos.put(codigo, produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Opcao de busca selecionada.");
                    System.out.print("Digite o codigo do produto: ");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine();

                    Produto produtoEncontrado = produtos.get(codigoBusca);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado: " + produtoEncontrado);
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}