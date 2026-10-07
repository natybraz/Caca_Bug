public class Funcionarios {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    public Funcionarios(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionarios(String ana, int i) {
    }

    // Método para aplicar o aumento no salário
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100.0);
        }
    }

    // Método para exibir as informações do funcionário no console
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
        System.out.println("-----------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}