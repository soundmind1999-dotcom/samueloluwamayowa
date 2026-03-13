public class AirConditioner {

    boolean isOn = false;
    int temperature = 16;

    public void turnOn() {
        isOn = true;
 }

    public void turnOff() {
        isOn = false;
 }

    public boolean isOn() {
        return isOn;
 }

    public void increaseTemperature() {
        if (isOn && temperature < 30) {
            temperature++;
      }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
   }
    }

    public int getTemperature() {
        return temperature;
}
}
