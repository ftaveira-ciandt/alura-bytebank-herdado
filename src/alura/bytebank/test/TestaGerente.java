package alura.bytebank.test;

import alura.bytebank.model.Gerente;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("987.654.321.00");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

//        g1.setSenha(2222);
//        boolean autenticou = g1.autentica(2222);
//        System.out.println(autenticou);
//
//        System.out.println(g1.getBonificacao());
    }

}
