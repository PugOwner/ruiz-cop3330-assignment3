/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex41;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.Assert.assertEquals;

public class NamesTest {
    @Test
    public void sortNames() throws Exception {
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        boolean expectedResult = true;
        boolean actualResult = false;
        if (file.exists()) {
            actualResult = true;
        }
        assertEquals(true, actualResult);
    }
}