public class Main {
    public static void main(String[] args) {
        ContaBancaria A = new ContaBancaria();
        A.id = 8574908;
        A.status = 'A';
        A.tipo = 'P';
        A.limiteCredito = 9.500;
        A.saldo = 240.560;
        A.enderecoCliente = "Rua das moças";
        System.out.println(A.id + "\n" + A.status + "\n" + A.tipo + "\n" + A.limiteCredito + "\n" + A.saldo + "\n" + A.enderecoCliente + "\n");

        Agencia B = new Agencia();
        B.id = 54;
        B.horarioAtendimento = 830.1800;
        B.localizacao = "Encruzilhada";
        B.telefone = 81.988459494;
        System.out.println(B.id + "\n" + B.telefone + "\n" + B.horarioAtendimento + "\n" + B.localizacao + "\n");

        Funcionario C = new Funcionario();
        C.cargo = "Gerente";
        C.id = 9;
        C.telefone = 81.998478435;
        C.salario = 12.500;
        C.status = 'D';
        C.dataNascimento = 13061971;
        C.email = "eduardofigueiro22@outlook.com";
        C.nome = "Eduado Figueiro";
        System.out.println(C.cargo + "\n" + C.email + "\n" + C.salario + "\n" + C.status + "\n" + C.telefone + "\n" + C.dataNascimento + "\n" + C.id + C.nome + "\n");

        Cartao D = new Cartao();
        D.nome = "Eduado Figueiro";
        D.bandeira = "Mastercard";
        D.id = 55;
        D.numero = 85748574;
        D.tipo = 'C';
        D.dataValidade = 12.29;
        System.out.println(D.nome + "\n" + D.dataValidade + "\n" + D.numero + "\n" + D.bandeira + "\n" + D.tipo + "\n" + D.id + "\n");

        Cliente E = new Cliente();
        E.cpf = 849829847;
        E.dataNascimento = 14021994;
        E.id = 9801;
        E.nome = "Pedro Fonseca de Aguiar";
        E.endreco = "Rua da amizade - Graças";
        E.numeroTelefone = 81.99845590;
        System.out.println(E.cpf + "\n" + E.dataNascimento + "\n" + E.numeroTelefone + "\n" + E.id + "\n" + E.nome + "\n" + E.endreco);
    }
}
