package Conta;

public class ContaTeste {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.atribuirNome("Deyse");
        c1.depositar(1000.00);
        c1.mostrarSaldo();
        c1.sacar(200.00);
        c1.mostrarSaldo();
        System.out.println("\n");

        Conta c2 = new Conta();
        c2.atribuirNome("Ana");
        c2.depositar(2000.00);
        c2.mostrarSaldo();
        c2.sacar(500.00);
        c2.mostrarSaldo();
        c2.depositar(350.00);
        c2.mostrarSaldo();
    }
    
}
