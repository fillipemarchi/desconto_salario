package aulas.oo.aaa;

public class Diretor extends Funcionario{

    public Diretor(String nome, String funcao, Double salario) {
        super(nome, funcao, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.1;
    }
}
