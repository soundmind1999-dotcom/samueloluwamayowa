import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void turnOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void turnOff() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
        assertFalse(ac.isOn());
  }

    @Test
    public void increaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
 }

    @Test
    public void decreaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseTemperature();
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
 }

    @Test
    public void temperatureNotAbove30() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();

        for(int count = 0; count < 15; count++) {
            ac.increaseTemperature();
      }
        assertEquals(30, ac.getTemperature());
 }

    @Test
    public void temperatureNotBelow16() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.decreaseTemperature();

        assertEquals(16, ac.getTemperature());
  }
}
