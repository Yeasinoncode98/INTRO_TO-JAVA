//probelm 1  Smart Transportation Booking System
abstract class Vehicle{
    private String vehicleNumber;
    private String modelName;
    protected double baseFare;


    public Vehicle(String vehicleNumber,String modelName, double baseFare){
        this.vehicleNumber=vehicleNumber;
        this.modelName=modelName;
        this.baseFare=baseFare;
    }
public String getVehicleNumber(){
    return vehicleNumber;
}
public String getModelName(){
    return modelName;
}

abstract double calculateFare(double distance);
public void displayInfo(){
    System.out.println("Vehicle Number: " + vehicleNumber);
    System.out.println("Model Name: " + modelName);
}

}

class Bike extends Vehicle{
    public Bike(String vehicleNumber,String modelName,double baseFare){
        super(vehicleNumber,modelName,baseFare);
    }
    @Override
    double calculateFare(double distance){
        return baseFare + (distance * 5);
    }
}

class Car extends Vehicle{
    public Car(String vehicleNumber,String modelName,double baseFare){
        super(vehicleNumber,modelName,baseFare);
    }
    @Override
    double calculateFare(double distance){
        return baseFare + (distance * 10);
    }
}


class Microbus extends Vehicle{
    public Microbus(String vehicleNumber,String modelName,double baseFare){
        super(vehicleNumber,modelName,baseFare);
    }
    @Override
    double calculateFare(double distance){
        return baseFare + (distance * 15);
    }
}

class BookingSystem{
    public void bookVehicle(Vehicle v,double distance){
        v.displayInfo();
        double fare = v.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + fare);
        System.out.println("---calculated the fare with proper distance----");


    }
}

public class problem1{
    public static void main(String[] args) {
        Vehicle bike = new Bike("B101", "Yamaha" ,50);
        Vehicle car = new Car("C202", "Toyota", 100);
        Vehicle microbus = new Microbus("M303", "Hiace", 150);
        BookingSystem booking = new BookingSystem();
        booking.bookVehicle(bike, 10);
        booking.bookVehicle(car, 20);
        booking.bookVehicle(microbus, 30);
    }
}