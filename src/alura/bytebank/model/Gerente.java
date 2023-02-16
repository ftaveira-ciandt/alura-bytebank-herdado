package alura.bytebank.model;

import alura.bytebank.controller.AutenticacaoUtil;
import alura.bytebank.controller.Autenticavel;

import java.util.GregorianCalendar;

public class Gerente extends Funcionario implements Autenticavel {


    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }


    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do gerente");
        return super.getSalario();
    }

    @Override public void setSenha(final int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override public boolean autentica(final int senha) {
        return this.autenticador.autentica(senha);

    }
    }


