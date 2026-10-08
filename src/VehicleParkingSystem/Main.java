package VehicleParkingSystem;

public class Main {
    public static void main(String[] args){

        SlotStack stack = new SlotStack(3);

        ParkingSlot s1 = new ParkingSlot("S1");
        ParkingSlot s2 = new ParkingSlot("S2");
        ParkingSlot s3 = new ParkingSlot("S3");

        stack.push(s3);
        stack.push(s2);
        stack.push(s1);

        ParkingSlot slot = stack.pop();
        System.out.println(slot.getSlotId());

        slot = stack.pop();
        System.out.println(slot.getSlotId());

        slot = stack.pop();
        System.out.println(slot.getSlotId());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());


    }
}
