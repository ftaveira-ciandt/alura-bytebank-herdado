package alura.bytebank.test;

import alura.bytebank.model.ControleBonificacao;
import alura.bytebank.model.Designer;
import alura.bytebank.model.EditorVIdeo;
import alura.bytebank.model.Funcionario;
import alura.bytebank.model.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

       final Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVIdeo ev = new EditorVIdeo();
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }

}
