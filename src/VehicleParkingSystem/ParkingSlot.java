package VehicleParkingSystem;

public class ParkingSlot {

    private String slotId;
    private boolean isAvailable;

    ParkingSlot(String slotId){
        this.slotId = slotId;
        isAvailable = true;
    }
    public String getSlotId(){
        return slotId;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable = available;
    }
}
