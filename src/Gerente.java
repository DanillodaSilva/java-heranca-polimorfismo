public non-sealed class Gerente extends Base {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public boolean isAdm() {
        return adm;
    }

    @Override
    public void exibirMenu() {

        System.out.println("\n=== MENU GERENTE ===");
        System.out.println("1-Gerar relatório");
        System.out.println("2-Consultar vendas");
        System.out.println("3-Alterar dados");
        System.out.println("4-Alterar senha");
        System.out.println("5-Logoff");
    }

    public void consultarVenda(Vendedor vendedor){
        System.out.printf("Total de vendas: "+ vendedor.getQuantidadeDeVendas());
    }

    public void gerarRelatorio(Vendedor vendedor, Atendente atendente) {

        System.out.println("=== RELATÓRIO ===");

        System.out.printf("Total de vendas: %d\n",vendedor.getQuantidadeDeVendas());

        System.out.printf("Valor em caixa: %.2f\n", atendente.getValorCaixa());

    }
    @Override
    public void executarOpMenu(int opMenu, Vendedor vendedor, Atendente atendente) {
        switch (opMenu) {
            case 1 -> gerarRelatorio(vendedor, atendente);
            case 2 -> consultarVenda(vendedor);
            case 3 -> alterarDados();
            case 4 -> alterarSenha();
            case 5 -> logoff();
            default -> System.out.println("Opção invalida");
        }
    }
}
