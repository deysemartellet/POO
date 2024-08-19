package Conta;

public class Conta {
    private String cliente;
    private double saldo = 0;

    public void atribuirNome(String c){
        this.cliente = c;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }
    public void mostrarSaldo(){
        System.out.println("O saldo de " + cliente + " é: " + this.saldo);
    }
}
