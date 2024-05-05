import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class RangeInputTest {
    RangeInput passengerTemperature1 , passengerTemperature2 ;


    @BeforeEach
    void setup(){
        passengerTemperature1 = new RangeInput(70 , 50);
        passengerTemperature2 = new RangeInput(75 , 55);
    }

    @Test
    void getCurrentTemperatureOfPassenger1() {
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.down();
        passengerTemperature1.up();
        assertEquals(62 , passengerTemperature1.getCurrentTemperature());

    }

    @Test
    void getCurrentTemperatureOfPassenger2() {
        passengerTemperature2.up();
        passengerTemperature2.down();
        passengerTemperature2.up();
        assertEquals(66 , passengerTemperature2.getCurrentTemperature());
    }

    @Test
    void up() {
    }

    @Test
    void down() {
    }

    @Test
    void getCurrentTemperature() {
    }
}