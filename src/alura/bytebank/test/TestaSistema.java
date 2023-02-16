package alura.bytebank.test;

import alura.bytebank.controller.SistemaInterno;
import alura.bytebank.model.Gerente;

public class TestaSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

    }

}
