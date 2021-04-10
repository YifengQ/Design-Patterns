public class SlotMachineApp {

    public static void main(String args[]) {
        SlotFactory slotFactory = new NVSlotFactory();
        SlotMachine slot = slotFactory.orderSlot("straight");
        slot.printInfo();
    }
}
