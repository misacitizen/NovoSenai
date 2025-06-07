package Model;

public class Aluno {
    public String nome;
    public double altura;
    public int anoMatricula;

    public void estudar() {
        System.out.println(nome + " está revisando conteúdos desde " + anoMatricula + ".");
    }
}
