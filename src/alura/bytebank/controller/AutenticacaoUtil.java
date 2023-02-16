package alura.bytebank.controller;

public class AutenticacaoUtil {

    private int senha;
    public void setSenha(final int senha) {
        this.senha = senha;

    }

    public boolean autentica(final int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }

}
