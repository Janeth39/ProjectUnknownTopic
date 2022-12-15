public class Main {

    public static void main(String[] args)
    {
        Car greenCar = new Car("721932", "Jayden", "37", "F", "300");
        System.out.println(greenCar.toString());
        greenCar.setAge("100");
        System.out.println(greenCar.getAge());
        greenCar.setName("J2re");
        System.out.println(greenCar.getName());

    }


}
