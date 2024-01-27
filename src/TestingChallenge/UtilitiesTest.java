package TestingChallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
        System.out.println("created new instance of Utilities class before running test");
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.Test
    public void removePairs() {
        //  "ABBCDEEF" -> "ABCDEF"
        //  "ABCCABDEEF" -> "ABCABDEF"
        assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("G", util.removePairs("G"));
        assertEquals("", util.removePairs(""));
        assertNull(util.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, util.converter(10, 5), 0);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_divideByZero() throws Exception {
        util.converter(10, 0);
        fail("Should have thrown an ArithmeticException");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}