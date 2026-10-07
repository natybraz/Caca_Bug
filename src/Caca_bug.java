public class Caca_bug {
  public static void main(String[] args) {

    Funcionarios funcionario = new Funcionarios("Carlos Silva", "123.456.789-00", "Desenvolvedor", 3000.00);

    System.out.println("--- Dados Iniciais ---");
    funcionario.exibirDados();

    funcionario.aumentarSalario(10.0);

    System.out.println("--- Dados Após Aumento ---");
    funcionario.exibirDados();
  }
}