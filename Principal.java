import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1: // Escolhe qual moeda adicionar
                    System.out.println("Escolha a moeda:");
                    System.out.println("1 - Dolar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    String tipoMoeda = scanner.nextLine();
                    System.out.println("Digite o valor: ");
                    double valor = lerValor(scanner);

                    if (tipoMoeda.equals("1")) {
                        cofre.adicionarMoeda(new Dolar(valor));
                    } else if (tipoMoeda.equals("2")) {
                        cofre.adicionarMoeda(new Euro(valor));
                    } else if (tipoMoeda.equals("3")) {
                        cofre.adicionarMoeda(new Real(valor));
                    } else {
                        System.out.println("Moeda não reconhecida.");
                    }
                    break;
                case 2: // Para remover moeda
                    System.out.println("Escolha a moeda para remoção:");
                    System.out.println("1 - Dolar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    tipoMoeda = scanner.nextLine();
                    System.out.println("Digite o valor da moeda a remover: ");
                    valor = lerValor(scanner);

                    // Remover a moeda escolhida
                    if (tipoMoeda.equals("1")) {
                        if (!cofre.removerMoeda(new Dolar(valor))) {
                            System.out.println("Moeda de " + valor + " Dolar não encontrada.");
                        }
                    } else if (tipoMoeda.equals("2")) {
                        if (!cofre.removerMoeda(new Euro(valor))) {
                            System.out.println("Moeda de " + valor + " Euro não encontrada.");
                        }
                    } else if (tipoMoeda.equals("3")) {
                        if (!cofre.removerMoeda(new Real(valor))) {
                            System.out.println("Moeda de " + valor + " Real não encontrada.");
                        }
                    } else {
                        System.out.println("Moeda não reconhecida.");
                    }
                    break;
                case 3: // Para ver a lista de moedas
                    cofre.listarMoedas();
                    break;
                case 4: // Calcula o total convertido para Real
                	System.out.println(String.format("Total em Real: %.2f", cofre.totalConvertido()));
                    break;
                case 5: // Sair
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
    }

    // Para exibir o menu
    public static void mostrarMenu() {
        System.out.println("COFRINHO:");
        System.out.println("1. Adicionar moeda");
        System.out.println("2. Remover moeda");
        System.out.println("3. Listar moedas");
        System.out.println("4. Calcular total em Real");
        System.out.println("5. Sair");
    }

    // Para ler valores e garantir que sejam numeros
    public static double lerValor(Scanner scanner) {
        double valor = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                valor = scanner.nextDouble();
                valido = true;
            } catch (Exception e) {
                System.out.println("Por favor, digite um numero valido.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
        return valor;
    }
}
