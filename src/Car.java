public class Car {
    private String plates;
    private String name;
    private String age;
    private String Gender;
    private String insuranceCost;

    public Car(String plates, String name, String age, String Gender,String insuranceCost)
    {
        setPlates(plates);
        setName(name);
        setAge(age);
        setGender(Gender);
        setInsuranceCost(insuranceCost);
    }
    public Car()
    {
        plates = "";
        name = "";
        age = "";
        Gender = "";
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
    public String getGender()
    {
        return Gender;
    }

    public void setGender(String Gender)
    {
\       if(Gender.equals("F")){
           Gender="Female";
       }
        else if(Gender.equals("M")){
            Gender="Male";
        }
    }
    public String getInsuranceCost()
    {
        return insuranceCost;
    }

    public void setInsuranceCost(String insuranceCost)
    {
        this.insuranceCost = insuranceCost;
    }


    @Override
    public String toString() {
        return "Car{" +
                "plates='" + plates + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
