package org.example;

// NOME = ARTHUR CHACON GARCIA SPEDINE
// RM = 554489

public class Apdex {

    public float calcularApdex(int s, int t, int a) {
        return (float) (s + (t / 2)) / a;
    }
}
