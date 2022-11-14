public class Car {
    private String plates;
    private String name;

    public Car(String plates, String name)
    {
        setPlates(plates);
        setName(name);
    }
    public Car()
    {
        plates = "";
        name = "";
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

    public String getName() {
        return name;
    }
    public void setName( String name) {
        if(!name.matches("[A-Z][a-z]*"))
        {
            this.name = "null";
        }
        else
        {
            this.name = name;
        }
    }
}
