public static void main(String[] args) {

        Funcionarios f = new Funcionarios("Carlos Silva", "123.456.789-00", "Desenvolvedor", 3000.00);

        f.exibirDados();
        f.aumentarSalario(10.0);
        f.exibirDados();
    }
