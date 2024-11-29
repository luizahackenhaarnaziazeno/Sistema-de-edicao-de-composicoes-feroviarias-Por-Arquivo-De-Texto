import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CadastroLocomotiva cl = new CadastroLocomotiva();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar nova locomotiva");
            System.out.println("2. Gravar locomotivas no arquivo");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLocomotiva(scanner, cl);
                    break;
                case 2:
                    System.out.println("\nGravando locomotivas no arquivo...");
                    cl.gravaLocomotiva();
                    System.out.println("Locomotivas gravadas com sucesso!");
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void cadastrarLocomotiva(Scanner scanner, CadastroLocomotiva cl) {
        System.out.println("\nDigite o ID da locomotiva:");
        int idlocomotiva = scanner.nextInt();

        System.out.println("Digite o peso da locomotiva:");
        double peso = scanner.nextDouble();

        System.out.println("Digite o número máximo de vagões:");
        int nummaxdevagoes = scanner.nextInt();

        System.out.println("Digite o ID do trem:");
        int idtrem = scanner.nextInt();

        Locomotiva novaLocomotiva = new Locomotiva(idlocomotiva, (int) peso, nummaxdevagoes, idtrem);
        cl.adicionarLocomotiva(novaLocomotiva);
        System.out.println("Locomotiva cadastrada com sucesso!");
    }
}
