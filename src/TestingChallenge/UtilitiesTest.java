package TestingChallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() {
        //  "ABBCDEEF" -> "ABCDEF"
        //  "ABCCABDEEF" -> "ABCABDEF"
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("G", util.removePairs("G"));
        assertNull(util.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("This test has not been implemented");
    }
}