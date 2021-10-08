package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    public void nameAndSalary() throws Exception {
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);
    }
}