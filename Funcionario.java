package aulas.oo.aaa;

public class Funcionario {

    private String nome;
    private String funcao;
    private Double salario;

    public Funcionario(String nome, String funcao, Double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calculaImposto() {
        return this.salario * 0.01;
    }
}
