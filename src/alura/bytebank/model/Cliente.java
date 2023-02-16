package alura.bytebank.model;

import alura.bytebank.controller.AutenticacaoUtil;
import alura.bytebank.controller.Autenticavel;

public class Cliente implements Autenticavel {

        private AutenticacaoUtil autenticador;

        public Cliente() {
            this.autenticador = new AutenticacaoUtil();
    }

    @Override public void setSenha(final int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override public boolean autentica(final int senha) {
       return this.autenticador.autentica(senha);

    }

}
