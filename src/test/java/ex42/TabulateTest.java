package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;


class TabulateTest {

    @Test
    public void nameAndSalary() throws Exception {
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);
    }
}