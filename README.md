# Ejercicio 4: Blackjack

- **Concepto:** Ternary Operators & Switch Statements (Operador ternario y condicionales)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Simular la toma de decisiones para la primera mano de Blackjack según las reglas de la estrategia básica.

## Acciones posibles:
- **"S" (Stand):** Quedarse con la mano actual sin pedir más cartas.
- **"H" (Hit):** Pedir otra carta.
- **"P" (Split):** Dividir la mano (cuando se tienen dos ases).
- **"W" (Win):** Ganar automáticamente con Blackjack.

## Tareas a Implementar en `Blackjack.java`:
1. `parseCard(String card)`: Retorna el valor numérico de cada carta.
2. `isBlackjack(String card1, String card2)`: Retorna si suman 21.
3. `largeHand(boolean isBlackjack, int dealerScore)`: Decide la acción para manos de 21 o más.
4. `smallHand(int handScore, int dealerScore)`: Decide la acción para manos de 20 o menos.
5. `firstTurn(String card1, String card2, String dealerCard)`: Combina las anteriores para emitir la recomendación final.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
