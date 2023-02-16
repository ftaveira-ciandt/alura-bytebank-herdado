package alura.bytebank.model;

public class Cliente implements Autenticavel {

        private int senha;

    @Override public void setSenha(final int senha) {
        this.senha = senha;
    }

    @Override public boolean autentica(final int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }

}
