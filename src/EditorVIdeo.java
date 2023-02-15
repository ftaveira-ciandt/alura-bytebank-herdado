public class EditorVIdeo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo do editor de video");
        return super.getBonificacao() + 100;

    }

}
