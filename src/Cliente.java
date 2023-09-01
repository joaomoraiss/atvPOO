public class Cliente {
    int cpf, id ;
    String nome, endreco;
    double numeroTelefone, dataNascimento;

    Cliente(int cpf, int id, String nome, String endreco, double numeroTelefone, double dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.id = id;
        this.endreco = endreco;
        this.dataNascimento = dataNascimento;
        this.numeroTelefone = numeroTelefone;
    }

    void alterarEndereco(String novoEndereco){
        this.endreco = novoEndereco;
    }
}
