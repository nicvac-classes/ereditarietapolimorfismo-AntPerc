import java.util.Scanner;

public class Esercizio {

    class Persona {
        protected String nome;
        protected int eta;
        protected float altezza;
        protected String genere;

        public Persona(String nome, int eta, float altezza, String genere) {
            this.nome = nome;
            this.eta = eta;
            this.altezza = altezza;
            this.genere = genere;
        }

        public void presentati() {
            System.out.println("Nome: " + nome + " - Eta: " + eta + " - Altezza: " + altezza + " - Genere: " + genere);
        }
    }

    class Atleta extends Persona {
        protected String sport;
        protected String categoria;
        protected int anniAttivita;

        public Atleta(String nome, int eta, float altezza, String genere, String sport, String categoria, int anniAttivita) {
            super(nome, eta, altezza, genere);
            this.sport = sport;
            this.categoria = categoria;
            this.anniAttivita = anniAttivita;
        }

        public void presentati() {
            System.out.println("Nome: " + nome + " - Eta: " + eta + " - Altezza: " + altezza + " - Genere: " + genere +
                    " - Sport: " + sport + " - Categoria: " + categoria + " - Anni di attivita: " + anniAttivita);
        }
    }

    class Calciatore extends Atleta {
        protected String piedeForte;
        protected String ruolo;
        protected int numeroMaglia;
        protected int presenze;
        protected int gol;
        protected int assist;
        protected int cartelliniGialli;
        protected int cartelliniRossi;

        public Calciatore(String nome, int eta, float altezza, String genere, String sport, String categoria,
                          int anniAttivita, String piedeForte, String ruolo, int numeroMaglia, int presenze,
                          int gol, int assist, int cartelliniGialli, int cartelliniRossi) {
            super(nome, eta, altezza, genere, sport, categoria, anniAttivita);
            this.piedeForte = piedeForte;
            this.ruolo = ruolo;
            this.numeroMaglia = numeroMaglia;
            this.presenze = presenze;
            this.gol = gol;
            this.assist = assist;
            this.cartelliniGialli = cartelliniGialli;
            this.cartelliniRossi = cartelliniRossi;
        }

        public void presentati() {
            System.out.println("Nome: " + nome + " - Eta: " + eta + " - Altezza: " + altezza + " - Genere: " + genere +
                    " - Sport: " + sport + " - Categoria: " + categoria + " - Anni di attivita: " + anniAttivita +
                    " - Piede forte: " + piedeForte + " - Ruolo: " + ruolo + " - Numero maglia: " + numeroMaglia +
                    " - Presenze: " + presenze + " - Gol: " + gol + " - Assist: " + assist +
                    " - Cartellini gialli: " + cartelliniGialli + " - Cartellini rossi: " + cartelliniRossi);
        }
    }

    class Tennista extends Atleta {
        protected String manoForte;
        protected int matchGiocati;
        protected int matchVinti;
        protected int posizioneClassificaATP;
        protected String nomePersonalCoach;

        public Tennista(String nome, int eta, float altezza, String genere, String sport, String categoria,
                        int anniAttivita, String manoForte, int matchGiocati, int matchVinti,
                        int posizioneClassificaATP, String nomePersonalCoach) {
            super(nome, eta, altezza, genere, sport, categoria, anniAttivita);
            this.manoForte = manoForte;
            this.matchGiocati = matchGiocati;
            this.matchVinti = matchVinti;
            this.posizioneClassificaATP = posizioneClassificaATP;
            this.nomePersonalCoach = nomePersonalCoach;
        }

        public void presentati() {
            System.out.println("Nome: " + nome + " - Eta: " + eta + " - Altezza: " + altezza + " - Genere: " + genere +
                    " - Sport: " + sport + " - Categoria: " + categoria + " - Anni di attivita: " + anniAttivita +
                    " - Mano forte: " + manoForte + " - Match giocati: " + matchGiocati + " - Match vinti: " + matchVinti +
                    " - Posizione Classifica ATP: " + posizioneClassificaATP +
                    " - Nome del personal coach: " + nomePersonalCoach);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Esercizio programma = new Esercizio(); // Necessario per accedere alle classi annidate non statiche

        // Input per creare un Calciatore
        System.out.print("Inserisci nome calciatore: ");
        String nome = in.nextLine();
        Calciatore c = programma.new Calciatore(nome, 28, 1.82f, "Maschio",
                "Calcio", "Professionista", 8,
                "Destro", "Centrocampista", 10, 150, 35, 40, 8, 1);

        // Input per creare un Tennista
        System.out.print("Inserisci nome tennista: ");
        String nomeT = in.nextLine();
        Tennista t = programma.new Tennista(nomeT, 25, 1.78f, "Maschio",
                "Tennis", "Professionista", 6,
                "Destra", 120, 85, 14, "Coach Neri");

        // Presentazioni
        System.out.println("\n--- Presentazione Calciatore ---");
        c.presentati();

        System.out.println("\n--- Presentazione Tennista ---");
        t.presentati();
    }
}