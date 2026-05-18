public non-sealed class Atendente extends Base {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha, double valorCaixa) {
        super(nome, email, senha, false);
        this.valorCaixa = valorCaixa;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
    public void fecharCaixa(){
        System.out.println("Valor final do caixa:"+ valorCaixa);
        valorCaixa = 0;
        System.out.println("Caixa fechado");
    }
    public void receberPagamento(Vendedor vendedor){
        valorCaixa = vendedor.getValorVend() + valorCaixa;
        vendedor.setValorVend(0);
        System.out.printf("O valor do caixa está em: %.2fR$", valorCaixa);
    }

    @Override
    public void exibirMenu() {

        System.out.println("\n=== MENU ATENDENTE ===");
        System.out.println("1-Receber pagamento");
        System.out.println("2-Fechar caixa");
        System.out.println("3-Alterar dados");
        System.out.println("4-Alterar senha");
        System.out.println("5-Logoff");
    }

    @Override
    public void executarOpMenu(int opMenu, Vendedor vendedor, Atendente atendente) {
        switch (opMenu) {
            case 1 -> receberPagamento(vendedor);
            case 2 -> fecharCaixa();
            case 3 -> alterarDados();
            case 4 -> alterarSenha();
            case 5 -> logoff();
            default -> System.out.println("Opção invalida");
        }
    }
}
