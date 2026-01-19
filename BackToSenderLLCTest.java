import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BackToSenderLLCTest {

    @Test
    void testLessThan50Percent() {
        assertEquals(9000, BackToSenderLLC.riderPayout(25));
    }

    @Test
    void testBetween50And59Percent() {
        assertEquals(15000, BackToSenderLLC.riderPayout(50));
    }

    @Test
    void testBetween60And69Percent() {
        assertEquals(20000, BackToSenderLLC.riderPayout(60));
    }

    @Test
    void testSeventyPercentAndAbove() {
        assertEquals(45000, BackToSenderLLC.riderPayout(80));
    }
}

