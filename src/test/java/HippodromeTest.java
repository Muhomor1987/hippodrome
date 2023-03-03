import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HippodromeTest {
    @Test
    void hippodromeConstructorShutThrowIllegalArgumentExceptionIfArgumentIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Hippodrome(null));
    }

    @Test
    void hippodromeConstructorShutThrowIllegalArgumentExceptionWithMessage() {
        Throwable throwable = assertThrows(IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Name cannot be null");
                });
        assertEquals("Name cannot be null",throwable.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {""," ","  ","   "})
    void hippodromeConstructorShutThrowIllegalArgumentExceptionIfSendSpace(String string){

    }
    @Test
    void getHorses() {

    }

    @Test
    void move() {
    }

    @Test
    void getWinner() {
    }
}