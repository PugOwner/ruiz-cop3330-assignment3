package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

class InputTest {

    @Test
    void previous() {
        File file = new File("src/main/java/ex46/exercise46_input.txt");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);

    }
}