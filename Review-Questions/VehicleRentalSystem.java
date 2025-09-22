
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle bike = new Bike("Hero", "Splendor", 300);
        Vehicle car = new Car("Honda", "City", 1000, true);
        Vehicle truck = new Truck("Tata", "407", 2000, 6);

      
        Customer c1 = new Customer("Rahul");


        c1.rentVehicle(bike, 3);
        c1.rentVehicle(car, 5);
        c1.rentVehicle(truck, 2);
    }

}

interface  Rentable{
    public double calculateRent(int days);
}
abstract class Vehicle implements Rentable{
    protected String brand;
    protected String model;
    protected double baseRate;
    Vehicle(String brand,String model,double baseRate)
    {
    this.brand=brand;
    this.model=model;
    this.baseRate=baseRate;
    }

    public String getDetail()
    {
       return "brand = "+brand+"Model = "+model;

    }

}
class Bike extends Vehicle {
    
    public Bike(String brand,String model,double baseRate)
    {
        super(brand,model,baseRate);
    }

    @Override
    public double calculateRent(int days)
    {

        return baseRate*days;
    }
}

class Car extends Vehicle {
    private boolean luxury;

    public Car(String brand, String model, double baseRate, boolean luxury) {
        super(brand, model, baseRate);
        this.luxury = luxury;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        if (luxury) {
            rent += 500;
        }
        return rent;
    }
}
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, double baseRate, double loadCapacity) {
        super(brand, model, baseRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        if (loadCapacity > 5) {
            rent += 1000; 
        }
        return rent;
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle v, int days) {
        System.out.println(name + " rented " + v.getDetail() +" for " + days + " days. Rent = Rs." +v.calculateRent(days));
    }
}
