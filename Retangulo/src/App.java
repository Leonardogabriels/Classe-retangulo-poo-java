import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();
        double comprimento, largura;


        System.out.println("informa a medida do local: ");
        System.out.println("informe primeiro o comprimento do local: ");
        comprimento = scanner.nextDouble();
        System.out.println("informe a largura do local: ");
        largura = scanner.nextDouble();
        scanner.close();
        
        retangulo1.setComprimento(comprimento);
        retangulo1.setLargura(largura);
        System.out.println("você irá precisar comprar " + retangulo1.calcularArea() + " Mts de piso para cobrir sua área total"); 
        System.out.println("você irá precisar de " + retangulo1.calcularPerimetro() + "Mts de rodapé");
    }
}
