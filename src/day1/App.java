package day1;
import day1.fold1.Car;

public class App {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.brandName = "mecedes";
       car1.model = "benz";
       car1.numWheels = 4;
       car1.year = 2018;

       System.out.println(car1.drive("mr U"));

       System.out.println("\n brand name : "+ car1.brandName);
    }
}
