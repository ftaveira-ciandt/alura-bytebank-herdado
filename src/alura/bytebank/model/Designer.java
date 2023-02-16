package alura.bytebank.model;

import alura.bytebank.model.Funcionario;

public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do alura.bytebank.model.Designer");
        return 200;
    }

}
