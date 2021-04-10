public class NVSlotFactory extends SlotFactory {

    public SlotMachine orderSlot(String type) {

        SlotMachine slotMachine = null;

        if (type.toLowerCase().equals("straight")) {
            slotMachine = new NVSlotMachineStraight();
        }

        else if (type.toLowerCase().equals("bonus")) {
            slotMachine = new NVSlotMachineBonus();
        }

        else if (type.toLowerCase().equals("progressive")) {
            slotMachine = new NVSlotMachineProgressive();
        }

        return slotMachine;
    }
}
