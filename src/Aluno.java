package src;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean isMenorDeIdade() {
        return idade < 18;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String getInfo() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nPeso: " + peso + " kg" +
                "\nAltura: " + altura + " m" +
                "\nIMC: " + String.format("%.2f", calcularIMC()) +
                "\nMenor de idade: " + (isMenorDeIdade() ? "Sim" : "Não");
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Gabriel", 17, 68.5, 1.75);
        Aluno aluno2 = new Aluno("Beatriz", 20, 55.0, 1.60);


        System.out.println(aluno1.getInfo());
        System.out.println();
        System.out.println(aluno2.getInfo());
    }
}
