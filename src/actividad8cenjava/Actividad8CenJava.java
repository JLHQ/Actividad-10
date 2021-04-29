package actividad8cenjava;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Luis_
 */
public class Actividad8CenJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        showMenu();
        /**System.out.println("Se creo el mazo");
        Deck deck = new Deck();
        System.out.println("Se barajea el mazo");
        deck.shuffleDeck();
        System.out.println("Se muestra la primera carta del mazo");
        deck.drawHead();
        System.out.println("Se muestra una carta al azar");
        deck.drawRandomCard();
        System.out.println("Se entrega una mano del mazo");
        deck.drawHand();*/
    }
    public static void showMenu() throws Exception{
        int optSelect;
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        Deck deck = new Deck();
        while(cont){
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opción:");
            System.out.println("1 Mezclar el mazo");
            System.out.println("2 sacar la primer carta");
            System.out.println("3 sacar una carta al azar");
            System.out.println("4 generar una mano de 5 cartas");
            System.out.println("0 Salir");
            optSelect = scan.nextInt();
            switch (optSelect){
                case 0:
                    System.out.println("¡Gracias por jugar!");
                    cont = false;
                    break;
                case 1:
                    System.out.println("Se barajea el mazo");
                    deck.shuffleDeck();
                    break;
                case 2:
                    System.out.println("Se muestra la primera carta del mazo");
                    deck.drawHead();
                    break;
                case 3:
                    System.out.println("Se muestra una carta al azar");
                    deck.drawRandomCard();
                    break;
                case 4:
                    System.out.println("Se muestra una mano del mazo");
                    deck.drawHand();
                    break;
                default:
                    try{
                        System.out.println("Esa opción no existe, ingrese otra");
                    }catch(Exception e){
                        
                    }
                    break;
            }
        }
    }
}
