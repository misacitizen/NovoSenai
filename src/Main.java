import Model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Model.Aluno {
    public static void main(String[] args) {

                Bond bond = new Bond();
                bond.name = "Tesouro Selic";
                bond.balance = 1000.00;

                bond.buyBond(24); // Compra um título com prazo de 24 meses
                bond.simulateInterest(); // Simula os juros por 24 meses

        Aluno pedro = new Aluno();
        pedro.nome = "Pedro";
        pedro.altura = 1.75;
        pedro.anoMatricula = 2021;

        Aluno carla = new Aluno();
        carla.nome = "Carla";
        carla.altura = 1.68;
        carla.anoMatricula = 2022;

        System.out.println(pedro.nome + " tem " + pedro.altura + "m de altura.");
        carla.estudar();


            }

}

