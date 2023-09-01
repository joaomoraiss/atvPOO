public class ContaBancaria {
    int id;
    char status, tipo;
    double limiteCredito, saldo;
    String enderecoCliente;

    ContaBancaria(int id, char status, char tipo, double limiteCredito, double saldo, String enderecoCliente){
        this.enderecoCliente = enderecoCliente;
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
        this.status = status;
        this.limiteCredito = limiteCredito;
    }
    void alterarLimite(double novoLimite){
        this.limiteCredito = novoLimite;
    }
}
