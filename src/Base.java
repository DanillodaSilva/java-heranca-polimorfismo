import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public sealed class Base permits Gerente, Vendedor, Atendente {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean adm;
    protected boolean logado = false;
    protected boolean sistemaNoAr = true;
    public Base(String nome, String email, String senha, boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    public boolean isSistemaNoAr() {
        return sistemaNoAr;
    }
    public void desligar(){
        sistemaNoAr = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return adm;
    }

    public boolean isLogado() {
        return logado;
    }

    public void logoff() {
        logado = false;
    }

    public void login(String emailver, String senhaver) {
        if (this.email.equals(emailver) && this.senha.equals(senhaver)) {
            System.out.println("Login feito com sucesso");
            logado = true;
        } else {
            System.out.println("Verifique se tudo está escrito corretamente");
        }
    }

    public void exibirMenu() {

    }

    public void executarOpMenu(int opMenu,Vendedor vendedor, Atendente atendente) {

    }
    public void consultarVenda(Vendedor vendedor){

    }
    public void alterarDados(){
        System.out.println("Digite o novo email:");
        Scanner sc = new Scanner(System.in);
        String novoEmaill = sc.next();
        this.email = novoEmaill;
        System.out.printf("Esse é o seu novo email: \n"+email);
    }
    public void alterarSenha(){
        System.out.println("Digite a nova senha:");
        Scanner sc = new Scanner(System.in);
        String novoSenha = sc.next();
        this.senha = novoSenha;
        System.out.println("Senha redefinida");
    }
}
