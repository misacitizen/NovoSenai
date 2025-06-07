public class ContaBancaria {
    public String name;
    public double balance;
    public double interestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposito (double valorDeposito) {
        balance += valorDeposito;
    }

    public void saqueBancario( double valorSaque) {
        if (valorSaque > balance) {
            System.out.println("Saldo insuficiente!");
        } else {
            balance -= valorSaque;
        }
    }
}