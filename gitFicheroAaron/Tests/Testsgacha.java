import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class Testsgacha {
    @Test
    public void TestFor1() {
        String result = v2.cocina("1");
        Assertions.assertEquals("1", result);
    }
    @Test
    public void TestFor2() {
        String result = v2.cocina("2");
        Assertions.assertEquals("2", result);
    }
}
