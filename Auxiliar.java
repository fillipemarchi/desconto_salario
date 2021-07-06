package aulas.oo.aaa;

public class Auxiliar extends Funcionario {

    public Auxiliar(String nome, String funcao, Double salario) {
        super(nome, funcao, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.03;
    }


}
