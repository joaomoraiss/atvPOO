public class Cartao {
    int numero, id;
    String bandeira, nome;
    double dataValidade;
    char tipo;

    Cartao(int numero, int id, String bandeira, String nome, double dataValidade, char tipo){
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.numero = numero;
        this.bandeira = bandeira;
        this.dataValidade = dataValidade;
    }

    void alterarTipo(char novoTipo){
        this.tipo = novoTipo;
    }
}
