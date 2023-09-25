import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uppgift 4

        // Skapar en scanner för inputen
        Scanner scanner = new Scanner(System.in);
        // Skapar en boolean variabel för do-while loopet
        boolean isPlaying = true;

        // Skapar en do while loop
        do {
            // Skriver ut texten
            System.out.println("Write the word \"stop\" to stop the loop");
            // Skapar en variabel för det som skrivs in i inputen
            String stop = scanner.nextLine();

            // Skapar en String variabel med ordet "stop"
            String x = "stop";

            // Om inputen innehåller ordet "stop" så stoppas loopet
            if(stop.equals("stop")){
                break;
            }

        }while(isPlaying);

    }
}
