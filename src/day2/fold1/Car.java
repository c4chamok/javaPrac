package day2.fold1;

public class Car {
    private String brandName;
    private String model;
    private int year;
    private int numWheels;

    public void setBrandName(String brandName) {

        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 2030) {
            System.out.println("year cant be more than 2030");
            return;
        }
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String drive(String driverName) {
        return "The "+ brandName +" is driving "+ "by " + driverName;
    }

    @Override
    public String toString() {
        return "{brandName: "+ brandName+", model: "+model+ ", year: " + year + ", numWheels: "+numWheels+"}";
    }

    
}
