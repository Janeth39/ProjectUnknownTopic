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
    void getNamePass()
    {
        Car greenCar = new Car();
        greenCar.setName("Jayden");
        assertTrue(greenCar.getName().matches("Jayden"));
    }
    @Test
    void setNamePass()
    {
        Car greenCar = new Car();
        greenCar.setName("Janeth");
        assertTrue(greenCar.getName().matches("Janeth"));
    }
    @Test
    void setNameNumberFail()
    {
        Car greenCar = new Car();
        greenCar.setName("Ja9eth");
        assertTrue(greenCar.getName().matches("null"));
    }
    @Test
    void setNameSpecialCharFail()
    {
        Car greenCar = new Car();
        greenCar.setName("Ja*eth");
        assertTrue(greenCar.getName().matches("null"));
    }
}