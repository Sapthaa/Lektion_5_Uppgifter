import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Uppgift 2
        System.out.println("Skriv ett tal: ");
        Scanner tal = new Scanner(System.in);

        int x = tal.nextInt();
        for(int i = 0; i < x; i++){
            System.out.println("Loopet kommer köras " + x + " gånger");
        }





    }
}