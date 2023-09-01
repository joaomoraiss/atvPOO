public class Main {
    public static void main(String[] args) {
        ContaBancaria A = new ContaBancaria(8574908, 'A', 'P', 9.500, 240.560, "Rua das moças");
        ContaBancaria A1 = new ContaBancaria(1, 'A', 'P', 1000.0, 500.0, "123 Main Street");
        System.out.println(A.id + "\n" + A.status + "\n" + A.tipo + "\n" + A.limiteCredito + "\n" + A.saldo + "\n" + A.enderecoCliente + "\n");
        A.alterarLimite(2000.0);
        System.out.println(A.limiteCredito);

        Agencia B = new Agencia(54,"Encruzilhada" , 81.998478435, 830.1800);
        Agencia B2 = new Agencia(2, "Rua Principal, 123", 123456789, 9.0);
        System.out.println(B.id + "\n" + B.telefone + "\n" + B.horarioAtendimento + "\n" + B.localizacao + "\n");
        B.alterarHorarioAtendimento(730.1800);
        System.out.println(B.horarioAtendimento);

        Funcionario C = new Funcionario("Gerente", "eduardofigueiro22@outlook.com","Eduado Figueiro",9, 81.998478435,12.500,13061971,'D'     );
        Funcionario C1 = new Funcionario("Gerente", "gerente@example.com", "João Silva", 3, 123456789, 5000.0, 19900101, 'A');
        System.out.println(C.cargo + "\n" + C.email + "\n" + C.salario + "\n" + C.status + "\n" + C.telefone + "\n" + C.dataNascimento + "\n" + C.id + C.nome + "\n");
        C.alterarSalario(6000.);
        System.out.println(C.salario);

        Cartao D = new Cartao(85748574, 55,"Mastercard", "Eduado Figueiro",12.29,'C');
        Cartao D1 = new Cartao(123456789, 4, "Visa", "João Silva", 202512, 'C');
        System.out.println(D.nome + "\n" + D.dataValidade + "\n" + D.numero + "\n" + D.bandeira + "\n" + D.tipo + "\n" + D.id + "\n");
        D.alterarTipo('D');
        System.out.println(D.tipo);

        Cliente E = new Cliente(849829847, 9801,"Pedro Fonseca de Aguiar","Rua da amizade - Graças", 81.99845590,14021994   );
        Cliente E1 = new Cliente(123456789, 5, "Maria Silva", "Rua Principal, 456", 987654321, 19900101);
        System.out.println(E.cpf + "\n" + E.dataNascimento + "\n" + E.numeroTelefone + "\n" + E.id + "\n" + E.nome + "\n" + E.endreco);
        E.alterarEndereco("Rua dos vales");
        System.out.println(E.endreco);
    }
}
