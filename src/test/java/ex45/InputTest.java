package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void getOriginalWord() {
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);

    }
}