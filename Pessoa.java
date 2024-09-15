import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, LocalDate dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public String getInfo() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento +
                ", Universidade: " + universidade.getNome();
    }

    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton (Nova Jersey - EUA)");
        Universidade cambridge = new Universidade("Cambridge (Inglaterra)");


        Pessoa einstein = new Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14), princeton);
        Pessoa newton = new Pessoa("Isaac Newton", LocalDate.of(1643, 1, 4), cambridge);


        System.out.println(einstein.getInfo());
        System.out.println(newton.getInfo());
    }
}

