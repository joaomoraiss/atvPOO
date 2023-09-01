public class Agencia {
    int  id;
    String localizacao;
    double telefone, horarioAtendimento;

    Agencia(int id, String localizacao, double telefone, double horarioAtendimento){
        this.id = id;
        this.localizacao = localizacao;
        this.telefone = telefone;
        this.horarioAtendimento = horarioAtendimento;
    }

    void alterarHorarioAtendimento(double novoHorario){
        this.horarioAtendimento = novoHorario;
    }
}
