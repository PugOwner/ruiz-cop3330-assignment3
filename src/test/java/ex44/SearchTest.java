package ex44;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void getProduct() {
        File file = new File("src/main/java/ex44/exercise44_input.json");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);
    }
}