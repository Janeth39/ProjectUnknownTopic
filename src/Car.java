public class Car {
    private String plates;
    private String name;
    private String age;

    public Car(String plates, String name, String age)
    {
        setPlates(plates);
        setName(name);
        setAge(age);
    }
    public Car()
    {
        plates = "";
        name = "";
        age = "";
    }


    public String getPlates()
    {
        return plates;
    }

    public void setPlates(String plates)
    {
        if(!plates.matches("[0-9]{7}"))
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

    public String getAge()
    {
        return age;
    }
    public void setAge( String age) {
        if(!age.matches("[0-9]{2}"))
        {
            this.age = "invalid";
        }
        else
        {
            this.age = age;
        }
    }
}
