import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(10, SkillDemo.multiply(5, 2)); // will return 15 instead of 10 - failed test
    }
}
