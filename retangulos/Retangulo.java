public class Retangulo {
    public String nome;
    public int altura;
    public int largura;

    public int calcularArea(){
        return this.altura*this.largura;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("\n");
    }
}