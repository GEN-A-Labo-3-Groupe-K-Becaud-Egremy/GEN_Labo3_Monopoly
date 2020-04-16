package ch.heig.gen.labo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void shouldHaveAName() {
        final String NAME = "5qu4r3";
        assertEquals(NAME, (new Square(NAME)).getName());
    }
}
