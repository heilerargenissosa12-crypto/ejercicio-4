package blackjack;

/**
 * Ejercicio 4: Blackjack
 * Concepto: Ternary Operators (Operador ternario ? : y estructuras condicionales)
 *
 * Implementa la lógica de toma de decisiones para el primer turno
 * de una partida de Blackjack siguiendo la estrategia básica.
 */
public class Blackjack {

    /**
     * Convierte el nombre de una carta en su valor numérico.
     */
    public int parseCard(String card) {
        switch (card.toLowerCase()) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    /**
     * Determina si dos cartas forman un Blackjack natural (suma 21 con 2 cartas).
     */
    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    /**
     * Toma de decisiones cuando la mano es grande (mayor a 20):
     * - Si son dos Ases (suma 22): dividir ("P" = Split).
     * - Si es Blackjack:
     *     - Si la carta del dealer vale menos de 10: gana automáticamente ("W" = Win).
     *     - Si la carta del dealer es 10 o un As: plantarse ("S" = Stand) y esperar.
     */
    public String largeHand(boolean isBlackjack, int dealerScore) {
        return !isBlackjack ? "P" : (dealerScore < 10 ? "W" : "S");
    }

    /**
     * Toma de decisiones cuando la mano es menor o igual a 20:
     * - Si suma 17 o más: plantarse ("S").
     * - Si suma 11 o menos: pedir carta ("H" = Hit).
     * - Si suma entre 12 y 16:
     *     - Si el dealer tiene 7 o más: pedir carta ("H").
     *     - Si el dealer tiene menos de 7: plantarse ("S").
     */
    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }
        if (handScore <= 11) {
            return "H";
        }
        // Entre 12 y 16 usando operador ternario
        return dealerScore >= 7 ? "H" : "S";
    }

    /**
     * Evalúa el primer turno completo del jugador y devuelve la acción recomendada:
     * "S" = Stand, "H" = Hit, "P" = Split, "W" = Win
     */
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        return (handScore > 20)
                ? largeHand(isBlackjack(card1, card2), dealerScore)
                : smallHand(handScore, dealerScore);
    }
}
