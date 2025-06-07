//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Bond bond = new Bond();
                bond.name = "Tesouro Selic";
                bond.balance = 1000.00;

                bond.buyBond(24); // Compra um título com prazo de 24 meses
                bond.simulateInterest(); // Simula os juros por 24 meses
            }

}

