// NOME = ARTHUR CHACON GARCIA SPEDINE
// RM = 554489
package org.example;

public class Apdex {

    public float calcularApdex(int s, int t, int a) {
        return (float) (s + (t / 2)) / a;
    }
}
