package day2;
import day2.fold1.Car;

public class App {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.setBrandName("tototox");
       car1.setModel("korolla");
       car1.setYear(2018);
       car1.setNumWheels(4);

       Car car2 = new Car();
       car2.setBrandName("mercedfer");
       car2.setModel("beqa");
       car2.setYear(2024);
       car2.setNumWheels(12);

       String message = car2.drive("Mr X");
    //    System.out.println(message + " fast");

    //    System.out.println("\n" + car1.getBrandName() + " " + car1.getModel() + " " + car1.getYear() + "\n");
    //    System.out.println("\n" + car2.getBrandName() + " " + car2.getModel() + " " + car2.getYear() + "\n");
       
       System.out.println(car1);
       System.out.println(car2);
    }
}
