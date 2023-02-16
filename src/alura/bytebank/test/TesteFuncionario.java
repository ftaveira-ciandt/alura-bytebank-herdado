package alura.bytebank.test;


import alura.bytebank.model.Funcionario;
import alura.bytebank.model.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("123.456.789-00");
        nico.setSalario(2600);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());


    }
}
