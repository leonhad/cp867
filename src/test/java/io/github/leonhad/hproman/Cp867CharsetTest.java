package io.github.leonhad.hproman;

import io.github.leonhad.cp867.Cp867Charset;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Cp867CharsetTest {

    @Test
    void testForName() {
        Charset charset = Charset.forName("cp867");
        assertNotNull(charset);
    }

    @Test
    void testAlternateChar() {
        Charset charset = new Cp867Charset();
        byte[] converted = "♬".getBytes(charset);
        assertEquals(1, converted.length);
        assertEquals((byte) 0x0E, converted[0]);

        converted = "♫".getBytes(charset);
        assertEquals(1, converted.length);
        assertEquals((byte) 0x0E, converted[0]);
    }
}
