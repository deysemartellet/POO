public class Condicionais3 {
    public static void main(String[] args) {
        int x = 1, y = 2;

        if ((x==1) && (y==0)) {
            System.out.println("x é igual a 1");
            System.out.println("y é igual a 0");
        } else if ((x==1) && (y==1)) {
            System.out.println("x é igual a 1");
            System.out.println("y é igual a 1");
        } else {
            System.out.println("x é igual a 1");
            System.out.println("y é igual a 2"); //y é dif de 0 e 1
        }
    }
}
