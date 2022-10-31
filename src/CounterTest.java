import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void shouldReturnCorrectRowAmount() {
        Counter testCounter = new Counter();
        for (int i = 0; i < 3; i++) {
            testCounter.increaseRowAmount();
        }
        int expected = 3;
        int actual = testCounter.getRowAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddCharacterCount() {
        Counter testCounter = new Counter();
        testCounter.addCharacterCount("Barcelona");
        testCounter.addCharacterCount("är");
        testCounter.addCharacterCount("Nice");
        int expected = 15;
        int actual = testCounter.getCharacterCount();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldNotAddCharacterCountIfStop() {
        Counter testCounter = new Counter();
        testCounter.addCharacterCount("Madrid");
        testCounter.addCharacterCount("stop");
        int expected = 6;
        int actual = testCounter.getCharacterCount();
        assertEquals(expected, actual);

    }
}