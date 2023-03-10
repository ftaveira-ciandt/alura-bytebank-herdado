package alura.bytebank.test;

import alura.bytebank.controller.SistemaInterno;
import alura.bytebank.model.Administrador;
import alura.bytebank.model.Cliente;
import alura.bytebank.model.Gerente;

public class TestaSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cl = new Cliente();
        cl.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cl);

    }

}
