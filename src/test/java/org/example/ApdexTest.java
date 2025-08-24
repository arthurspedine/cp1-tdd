// NOME = ARTHUR CHACON GARCIA SPEDINE
// RM = 554489
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApdexTest {


    Apdex apdex;

    @BeforeEach
    void setup() {
        apdex = new Apdex();
    }

    @Test
    void validarApdexExcelente() {
        float score = apdex.calcularApdex(554489, 0, 554489);
        assertEquals(1, score, 0.001);
    }

    @Test
    void validarApdexBom() {
        float score = apdex.calcularApdex(482405, 22179, 554489);
        assertEquals(0.89, score, 0.001);
    }

    @Test
    void validarApdexRazoavel() {
        float score = apdex.calcularApdex(426956, 33269, 554489);
        assertEquals(0.8, score, 0.001);
    }

    @Test
    void validarApdexRuim() {
        float score = apdex.calcularApdex(327148, 0, 554489);
        assertEquals(0.59, score, 0.001);
    }


    @Test
    void validarApdexInaceitavel() {
        float score = apdex.calcularApdex(127532, 255064, 554489);
        assertEquals(0.46, score, 0.001);
    }

}
