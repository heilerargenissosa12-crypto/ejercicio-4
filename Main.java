package blackjack;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 4: Blackjack (Ternary Operators)");
        System.out.println("==================================================");

        Blackjack bj = new Blackjack();

        // 1. Parsear cartas
        int ace = bj.parseCard("ace");
        int king = bj.parseCard("king");
        System.out.println("1. Valor de As: " + ace + " | Rey: " + king);

        // 2. Blackjack natural
        boolean isBj = bj.isBlackjack("ace", "king");
        System.out.println("2. As + Rey es Blackjack? " + isBj + " (Esperado: true)");

        // 3. Primer turno: As + Rey contra un 9 del dealer -> "W"
        String turn1 = bj.firstTurn("ace", "king", "nine");
        System.out.println("3. Decision con As + Rey vs 9: " + turn1 + " (Esperado: W)");

        // 4. Primer turno: Dos Ases -> "P" (Split)
        String turn2 = bj.firstTurn("ace", "ace", "two");
        System.out.println("4. Decision con As + As: " + turn2 + " (Esperado: P)");

        // 5. Primer turno: 10 + 5 (15) vs 6 del dealer -> "S" (Stand)
        String turn3 = bj.firstTurn("ten", "five", "six");
        System.out.println("5. Decision con 15 vs 6: " + turn3 + " (Esperado: S)");

        // 6. Primer turno: 10 + 5 (15) vs 8 del dealer -> "H" (Hit)
        String turn4 = bj.firstTurn("ten", "five", "eight");
        System.out.println("6. Decision con 15 vs 8: " + turn4 + " (Esperado: H)");

        boolean ok = isBj && turn1.equals("W") && turn2.equals("P") && turn3.equals("S") && turn4.equals("H");
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
