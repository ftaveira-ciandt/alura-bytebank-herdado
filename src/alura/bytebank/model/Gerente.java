package alura.bytebank.model;

public class Gerente extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do gerente");
        return super.getSalario();
    }



}
