package aulas.oo.aaa;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, String funcao, Double salario) {
        super(nome, funcao, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.07;
    }
}
