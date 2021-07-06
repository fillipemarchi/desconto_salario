package aulas.oo.aaa;

public class Programa {

    public static void main(String[] args) {

    Funcionario auxiliar = new Auxiliar("Dudu", "Auxiliar Adm", 1600.0);
    Funcionario supervisor = new Supervisor("Alex","Supervisor", 4500.0);
    Funcionario diretor = new Diretor("Ester", "Diretora de Tecnologia", 18000.0);



        System.out.println("O funcionário: "+ auxiliar.getNome() + " - " + auxiliar.getFuncao() +", recebe: "+ auxiliar.getSalario() +" reais e tem desconto de: " + auxiliar.calculaImposto()+" reais");
        System.out.println("O funcionário: "+ supervisor.getNome() + " - " + supervisor.getFuncao() +", recebe: "+ supervisor.getSalario() +" reais e tem desconto de: " + supervisor.calculaImposto()+" reais");
        System.out.println("O funcionário: "+ diretor.getNome() + " - " + diretor.getFuncao() +", recebe: "+ diretor.getSalario() +" reais e tem desconto de: " + diretor.calculaImposto()+" reais");
    }

}


