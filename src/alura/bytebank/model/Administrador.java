package alura.bytebank.model;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;


    @Override public double getBonificacao() {
        return 50;
    }

    @Override public void setSenha(final int senha) {

    }

    @Override public boolean autentica(final int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }

}
