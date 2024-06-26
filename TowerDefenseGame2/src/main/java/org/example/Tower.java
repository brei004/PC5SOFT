package org.example;

public class Tower {
    private char symbol;

    public Tower(char symbol) {
        // Precondición: el símbolo debe ser un carácter imprimible.
        if (!Character.isLetterOrDigit(symbol)) {
            throw new IllegalArgumentException("El simbolo tiene que ser imprimible");
        }
        this.symbol = symbol;
        // Invariante: el símbolo debe ser un carácter imprimible.
        assert Character.isLetterOrDigit(this.symbol) : "Invariante error: tiene que ser imprimible";
    }

    public char getSymbol() {
        // Invariante: el símbolo debe ser un carácter imprimible.
        assert Character.isLetterOrDigit(this.symbol) : "Invariante error: tiene que ser imprimible";

        return symbol;
    }
}
