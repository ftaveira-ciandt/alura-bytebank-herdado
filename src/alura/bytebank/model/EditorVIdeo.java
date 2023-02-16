package alura.bytebank.model;

import alura.bytebank.model.Funcionario;

public class EditorVIdeo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do editor de video");
        return 150;

    }

}
