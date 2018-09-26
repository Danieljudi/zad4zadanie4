import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Witaj w programie zliczajacym noty.");
        System.out.println("Noty sa to punkty w skali od 1-10 w trzech konkurencjach.");
        System.out.println();
            System.out.print("Podaj prosze note za styl:");
            Scanner scanner=new Scanner(System.in);
            int styl = scanner.nextInt();

            System.out.print("Podaj prosze note za efekty:");
            Scanner scanner2= new Scanner(System.in);
            int efekty =scanner.nextInt();

            System.out.print("Podaj prosze note za rezultat:");
            Scanner scanner3=new Scanner(System.in);
            int rezultat =scanner.nextInt();

            double suma;
            suma=(styl*0.2)+(efekty*0.3)+(rezultat*0.5);
        System.out.println("Suma wszystkich not wynosi "+suma+". Gratulacje!");




    }

}
