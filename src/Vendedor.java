import java.util.Scanner;

public non-sealed class Vendedor extends Base {
    private int quantidadeDeVendas;
    private double valorVend;

    public Vendedor(String nome, String email, String senha, int quantidadeDeVendas) {
        super(nome, email, senha, false);
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public double getValorVend() {
        return valorVend;
    }

    public void setValorVend(double valorVend) {
        this.valorVend = valorVend;
    }

    @Override
    public void exibirMenu() {

        System.out.println("\n=== MENU VENDEDOR ===");
        System.out.println("1-Realizar venda");
        System.out.println("2-Consultar vendas");
        System.out.println("3-Alterar dados");
        System.out.println("4-Alterar senha");
        System.out.println("5-Logoff");
    }
    public void vender(Atendente atendente){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digote o valor da venda");;
        double valDaVenda = sc.nextDouble();
        valorVend = valorVend + valDaVenda;
        quantidadeDeVendas++;
        System.out.println("Venda concluida com sucesso");
    }

    @Override
    public void executarOpMenu(int opMenu, Vendedor vendedor, Atendente atendente) {
        switch (opMenu) {
            case 1 -> vender(atendente);
            case 2 -> consultarVenda(vendedor);
            case 3 -> alterarDados();
            case 4 -> alterarSenha();
            case 5 -> logoff();
            default -> System.out.println("Opção invalida");
        }
    }
}
