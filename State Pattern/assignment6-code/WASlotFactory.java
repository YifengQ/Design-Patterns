public class WASlotFactory extends SlotFactory {

    public SlotMachine orderSlot(String type) {

        SlotMachine slotMachine = null;

        if (type.toLowerCase().equals("straight")) {
            slotMachine = new WASlotMachineStraight();
        }

        else if (type.toLowerCase().equals("bonus")) {
            slotMachine = new WASlotMachineBonus();
        }

        else if (type.toLowerCase().equals("progressive")) {
            slotMachine = new WASlotMachineProgressive();
        }

        return slotMachine;
    }
}