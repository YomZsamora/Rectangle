import models.Rectangle;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertTrue(testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsLength_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }

    @Test
    public void getWidth_getsRectangleWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    public void isSquare_whenNotASquare_false() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertFalse(testRectangle.isSquare());
    }

    @Test
    public void isSquare_allSidesEqual_true() {
        Rectangle testRectangle = new Rectangle(2, 2);
        assertTrue(testRectangle.isSquare());
    }
}
