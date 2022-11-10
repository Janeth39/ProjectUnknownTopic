import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void getPlatesPassed()
    {
        Car greenCar = new Car();
        greenCar.setPlates("0000000");
        assertTrue(greenCar.getPlates().matches("0000000"));
    }
    @Test
    void setPlatesPassed() {
        Car greenCar = new Car();
        greenCar.setPlates("2345691");
        assertTrue(greenCar.getPlates().matches("2345691"));
    }
    @Test
    void setPlatesLetterFail() {
        Car greenCar = new Car();
        greenCar.setPlates("234A691");
        assertTrue(greenCar.getPlates().matches("0000000"));
    }
    @Test
    void setPlatesSpecialCharFail() {
        Car greenCar = new Car();
        greenCar.setPlates("234*691");
        assertTrue(greenCar.getPlates().matches("0000000"));
    }

    @Test
    void setNamePass() {
        Car greenCar = new Car("Jayden");
        greenCar.setPlates("2347691");
        assertTrue(greenCar.getPlates().matches("2347691"));
    }
}