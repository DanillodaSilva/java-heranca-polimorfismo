import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Base usuario = null;
        Gerente gerente =
                new Gerente(
                        "Danillo",
                        "admin@gmail.com",
                        "1234"
                );

        Vendedor vendedor =
                new Vendedor(
                        "Anna",
                        "vendedor@gmail.com",
                        "4321",
                        0
                );


        Atendente atendente =
                new Atendente(
                        "Julia",
                        "atendente@gmail.com",
                        "9999",
                        0
                );
        while (atendente.sistemaNoAr){
            System.out.println("1-Gerente");
            System.out.println("2-Vendedor");
            System.out.println("3-Atendente");
            System.out.println("4-Desligar");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> usuario = gerente;

                case 2 -> usuario = vendedor;

                case 3 -> usuario = atendente;

                case 4 -> {
                    atendente.desligar();
                    System.exit(0);
                }

                default -> {
                    System.out.println("Opção inválida");
                    System.exit(0);
                }
            }

            System.out.println("Digite seu email de login");
            String emailver = sc.next();
            System.out.println("Digite sua senha de login");
            String senhaver = sc.next();
            usuario.login(emailver, senhaver);

            while (usuario.isLogado()) {
                usuario.exibirMenu();
                int opMenu = sc.nextInt();
                usuario.executarOpMenu(opMenu, vendedor, atendente);
            }
        }


    }

}