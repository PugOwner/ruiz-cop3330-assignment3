package ex41;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.Assert.assertEquals;

class OutputNamesTest {
    @Test

    public void outputNames() throws Exception {
        File file = new File("src/main/java/ex41/exercise41_output.txt");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);
    }

}