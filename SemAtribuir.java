import java.util.Scanner;

public class SemAtribuir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        sc.close();
        
        System.out.println(numero + " " + palavra);
    }
    
}
