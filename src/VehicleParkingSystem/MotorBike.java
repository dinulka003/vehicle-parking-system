package VehicleParkingSystem;

public class MotorBike extends Vehicle {

    public MotorBike(String plateNumber,String ownerName){
        super(plateNumber,ownerName);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 100;
    }
}
