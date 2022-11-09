public class Car {
    private String plates;

    public Car(String plates)
    {
        setPlates(plates);
    }
    public Car()
    {
        plates = "";
    }


    public String getPlates()
    {
        return plates;
    }

    public void setPlates(String plates)
    {
        if(!plates.matches("[0-9]*"))
        {
            this.plates = "0000000";
        }

        else
        {
            this.plates = plates;
        }
    }
}
