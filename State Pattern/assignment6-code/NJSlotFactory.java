public class NJSlotFactory extends SlotFactory {

    public SlotMachine orderSlot(String type) {

        SlotMachine slotMachine = null;

        if (type.toLowerCase().equals("straight")) {
            slotMachine = new NJSlotMachineStraight();
        }

        else if (type.toLowerCase().equals("bonus")) {
            slotMachine = new NJSlotMachineBonus();
        }

        else if (type.toLowerCase().equals("progressive")) {
            slotMachine = new NJSlotMachineProgressive();
        }

        return slotMachine;
    }
}