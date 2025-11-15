import fold1.Car;

public class App {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.brandName = "tototox";
       car1.model = "korolla";
       car1.year = 2018;
       car1.numWheels = 4;

       Car car2 = new Car();
       car2.brandName = "mercedfer";
       car2.model = "beqa";
       car2.year = 2405;
       car2.numWheels = 12;

       car2.drive("Mr X");

       System.out.println("\n" + car1.brandName + " " + car1.model + " " + car1.year + "\n");
       System.out.println("\n" + car2.brandName + " " + car2.model + " " + car2.year + "\n");
    }
}
