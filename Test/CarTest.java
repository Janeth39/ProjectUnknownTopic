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
    void setPlatesSpecialChar2Fail() {
        Car greenCar = new Car();
        greenCar.setPlates("234/691");
        assertTrue(greenCar.getPlates().matches("0000000"));
    }
    @Test
    void setPlatesTooManyFail() {
        Car greenCar = new Car();
        greenCar.setPlates("23476918");
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

    @Test
    void getAge()
    {
        Car greenCar = new Car();
        greenCar.setAge("23");
        assertTrue(greenCar.getAge().matches("23"));
    }
    @Test
    void setAgePass()
    {
        Car greenCar = new Car();
        greenCar.setAge("24");
        assertTrue(greenCar.getAge().matches("24"));
    }
    @Test
    void setAgeLetterFail()
    {
        Car greenCar = new Car();
        greenCar.setAge("24M");
        assertTrue(greenCar.getAge().matches("invalid"));
    }
    @Test
    void setAgeSpaceFail()
    {
        Car greenCar = new Car();
        greenCar.setAge("2 4");
        assertTrue(greenCar.getAge().matches("invalid"));
    }
    @Test
    void setAgeLowNumFail()
    {
        Car greenCar = new Car();
        greenCar.setAge("2");
        assertTrue(greenCar.getAge().matches("invalid"));
    }
    @Test
    void setAgeNumPassed()
    {
        Car greenCar = new Car();
        greenCar.setAge("98");
        assertTrue(greenCar.getAge().matches("98"));
    }
}