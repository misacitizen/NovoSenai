public class Product {
    public String name;
    public double price;
    public int quantity;

    // Método para adicionar ao estoque
    public void addStock(int amount) {
        quantity += amount;
        System.out.println(amount + " unidades adicionadas ao estoque. Estoque atual: " + quantity);
    }

    // Método para vender o produto
    public void sellProduct(int amount) {
        if (amount > quantity) {
            System.out.println("Estoque insuficiente! Estoque atual: " + quantity);
        } else {
            quantity -= amount;
            System.out.println(amount + " unidades vendidas. Estoque restante: " + quantity);
        }
    }
}