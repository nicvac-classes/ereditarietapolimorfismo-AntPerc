import java.util.Scanner;

class Esercizio {
    public static void main(String args[])
    {
        String nome;

        Scanner in = new Scanner( System.in );

        System.out.print("Inserisci il tuo nome: ");
        nome = in.nextLine();

        System.out.println("Ciao "+nome+"!");
    }
}