public class Funcionario {
    String cargo, email, nome;
    int  id;
    double telefone, salario, dataNascimento;
    char status;

    Funcionario(String cargo, String email, String nome, int id, double telefone, double salario, double dataNascimento,
    char status){
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.status = status;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
        this.email = email;
    }

    void alterarSalario(double novoSalario){
        this.salario = novoSalario;
    }
}
