import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTest {
    @Test
    public void testIsEven() {
        assertTrue(NumberUtils.isEven(2));
        assertFalse(NumberUtils.isEven(3));
    }
}
