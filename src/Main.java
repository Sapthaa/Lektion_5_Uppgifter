import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Uppgift 5
        // Skapar en scanner för input
        Scanner input = new Scanner(System.in);
        //Skapar en boolean variabel för do while loopet
        boolean isPlaying = true;

        do {
            // Skriver ut texten
            System.out.println("Write \"STOP!\" to end or 1 to throw: ");
            // Skapar en string variabel för inputen
            String val = input.nextLine();

            // Skapar en switch med inputens värde
            switch (val){
                case "1":
                    // Om inputen innehåller siffran "1" så skrivs texten ut
                    System.out.println("Throwing!");
                    // avbryter caset
                    break;

                case "STOP!":
                    /* Om inputen innehåller ordet "STOP!" så blir boolean variabeln isPlaying false,
                    vilket gör att loopet kommer att avslutas helt
                     */
                    isPlaying = false;
                    break;

                default:
                    // Om inputen inte innehåller någon av dessa, kommer texten skrivas ut
                    System.out.println("Wrong input");

            }

        }while(isPlaying);


    }
}
