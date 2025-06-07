public class Bond {public String name;
    public double balance;
    public double rate;
    public int term;
    public int monthsRemaining;

    // Método para comprar o título
    public void buyBond(int term) {
        this.term = term;
        this.monthsRemaining = term;

        if (term >= 0 && term < 12) {
            rate = 0.005;
        } else if (term >= 12 && term < 24) {
            rate = 0.010;
        } else if (term >= 24 && term < 36) {
            rate = 0.015;
        } else if (term >= 36 && term < 48) {
            rate = 0.020;
        } else if (term >= 48 && term <= 60) {
            rate = 0.025;
        } else {
            System.out.println("Prazo inválido!");
            term = 0;
            rate = 0.0;
        }
    }

    // Método para simular o ganho de juros
    public void simulateInterest() {
        while (monthsRemaining > 0) {
            balance += balance * rate / 12;
            monthsRemaining--;
            System.out.println("Saldo: $" + balance + " | Meses Restantes: " + monthsRemaining);
        }
        System.out.println("Título vencido!");
    }
}


